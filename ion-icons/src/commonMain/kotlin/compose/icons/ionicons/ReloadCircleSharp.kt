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

public val IonIcons.ReloadCircleSharp: ImageVector
    get() {
        if (_reloadCircleSharp != null) {
            return _reloadCircleSharp!!
        }
        _reloadCircleSharp = Builder(name = "ReloadCircleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(376.0f, 238.77f)
                horizontalLineTo(287.0f)
                lineToRelative(36.88f, -36.88f)
                lineToRelative(-5.6f, -6.51f)
                arcToRelative(87.38f, 87.38f, 0.0f, true, false, -62.94f, 148.0f)
                arcToRelative(87.55f, 87.55f, 0.0f, false, false, 82.42f, -58.25f)
                lineTo(343.13f, 270.0f)
                lineToRelative(30.17f, 10.67f)
                lineTo(368.0f, 295.8f)
                arcTo(119.4f, 119.4f, 0.0f, true, true, 255.38f, 136.62f)
                arcToRelative(118.34f, 118.34f, 0.0f, false, true, 86.36f, 36.95f)
                lineToRelative(0.56f, 0.62f)
                lineToRelative(4.31f, 5.0f)
                lineTo(376.0f, 149.81f)
                close()
            }
        }
        .build()
        return _reloadCircleSharp!!
    }

private var _reloadCircleSharp: ImageVector? = null
