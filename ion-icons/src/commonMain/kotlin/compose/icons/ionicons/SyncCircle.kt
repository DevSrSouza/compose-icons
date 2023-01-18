package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.SyncCircle: ImageVector
    get() {
        if (_syncCircle != null) {
            return _syncCircle!!
        }
        _syncCircle = Builder(name = "SyncCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.13f, 48.0f, 48.0f, 141.13f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.13f, 208.0f, -208.0f)
                reflectiveCurveTo(370.87f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(339.69f, 330.65f)
                arcToRelative(112.24f, 112.24f, 0.0f, false, true, -195.0f, -61.29f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -20.13f, -24.67f)
                lineToRelative(23.6f, -23.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.37f, -0.25f)
                lineToRelative(24.67f, 23.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -18.0f, 26.0f)
                arcToRelative(80.25f, 80.25f, 0.0f, false, false, 138.72f, 38.83f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 23.77f, 21.41f)
                close()
                moveTo(387.45f, 267.31f)
                lineTo(363.85f, 290.91f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.37f, 0.25f)
                lineToRelative(-24.67f, -23.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 17.68f, -26.11f)
                arcTo(80.17f, 80.17f, 0.0f, false, false, 196.0f, 202.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -23.82f, -21.37f)
                arcToRelative(112.17f, 112.17f, 0.0f, false, true, 194.88f, 61.57f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 20.39f, 24.47f)
                close()
            }
        }
        .build()
        return _syncCircle!!
    }

private var _syncCircle: ImageVector? = null
