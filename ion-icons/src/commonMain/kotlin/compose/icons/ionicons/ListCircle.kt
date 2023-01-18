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

public val IonIcons.ListCircle: ImageVector
    get() {
        if (_listCircle != null) {
            return _listCircle!!
        }
        _listCircle = Builder(name = "ListCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(168.0f, 350.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 168.0f, 350.0f)
                close()
                moveTo(168.0f, 279.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 168.0f, 279.0f)
                close()
                moveTo(168.0f, 206.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 168.0f, 206.0f)
                close()
                moveTo(352.0f, 341.0f)
                lineTo(224.0f, 341.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                lineTo(352.0f, 309.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
                moveTo(352.0f, 270.0f)
                lineTo(224.0f, 270.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                lineTo(352.0f, 238.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
                moveTo(352.0f, 198.0f)
                lineTo(224.0f, 198.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                lineTo(352.0f, 166.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
            }
        }
        .build()
        return _listCircle!!
    }

private var _listCircle: ImageVector? = null
