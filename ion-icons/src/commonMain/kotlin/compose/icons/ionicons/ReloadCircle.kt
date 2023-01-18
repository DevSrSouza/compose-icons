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

public val IonIcons.ReloadCircle: ImageVector
    get() {
        if (_reloadCircle != null) {
            return _reloadCircle!!
        }
        _reloadCircle = Builder(name = "ReloadCircle", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(376.0f, 230.15f)
                arcToRelative(8.62f, 8.62f, 0.0f, false, true, -8.62f, 8.62f)
                horizontalLineTo(307.84f)
                arcToRelative(8.61f, 8.61f, 0.0f, false, true, -6.09f, -14.71f)
                lineToRelative(22.17f, -22.17f)
                lineToRelative(-5.6f, -6.51f)
                arcToRelative(87.38f, 87.38f, 0.0f, true, false, -62.94f, 148.0f)
                arcToRelative(87.55f, 87.55f, 0.0f, false, false, 82.42f, -58.25f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 368.0f, 295.8f)
                arcTo(119.4f, 119.4f, 0.0f, true, true, 255.38f, 136.62f)
                arcToRelative(118.34f, 118.34f, 0.0f, false, true, 86.36f, 36.95f)
                lineToRelative(0.56f, 0.62f)
                lineToRelative(4.31f, 5.0f)
                lineToRelative(14.68f, -14.68f)
                arcToRelative(8.44f, 8.44f, 0.0f, false, true, 6.0f, -2.54f)
                arcToRelative(8.61f, 8.61f, 0.0f, false, true, 8.68f, 8.63f)
                close()
            }
        }
        .build()
        return _reloadCircle!!
    }

private var _reloadCircle: ImageVector? = null
