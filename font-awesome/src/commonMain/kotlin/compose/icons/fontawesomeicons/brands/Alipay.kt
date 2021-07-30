package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Alipay: ImageVector
    get() {
        if (_alipay != null) {
            return _alipay!!
        }
        _alipay = Builder(name = "Alipay", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(377.74f, 32.0f)
                horizontalLineTo(70.26f)
                curveTo(31.41f, 32.0f, 0.0f, 63.41f, 0.0f, 102.26f)
                verticalLineToRelative(307.48f)
                curveTo(0.0f, 448.59f, 31.41f, 480.0f, 70.26f, 480.0f)
                horizontalLineToRelative(307.48f)
                curveToRelative(38.52f, 0.0f, 69.76f, -31.08f, 70.26f, -69.6f)
                curveToRelative(-45.96f, -25.62f, -110.59f, -60.34f, -171.6f, -88.44f)
                curveToRelative(-32.07f, 43.97f, -84.14f, 81.0f, -148.62f, 81.0f)
                curveToRelative(-70.59f, 0.0f, -93.73f, -45.3f, -97.04f, -76.37f)
                curveToRelative(-3.97f, -39.01f, 14.88f, -81.5f, 99.52f, -81.5f)
                curveToRelative(35.38f, 0.0f, 79.35f, 10.25f, 127.13f, 24.96f)
                curveToRelative(16.53f, -30.09f, 26.45f, -60.34f, 26.45f, -60.34f)
                horizontalLineToRelative(-178.2f)
                verticalLineToRelative(-16.7f)
                horizontalLineToRelative(92.08f)
                verticalLineToRelative(-31.24f)
                horizontalLineTo(88.28f)
                verticalLineToRelative(-19.01f)
                horizontalLineToRelative(109.44f)
                verticalLineTo(92.34f)
                horizontalLineToRelative(50.92f)
                verticalLineToRelative(50.42f)
                horizontalLineToRelative(109.44f)
                verticalLineToRelative(19.01f)
                horizontalLineTo(248.63f)
                verticalLineToRelative(31.24f)
                horizontalLineToRelative(88.77f)
                reflectiveCurveToRelative(-15.21f, 46.62f, -38.35f, 90.92f)
                curveToRelative(48.93f, 16.7f, 100.01f, 36.04f, 148.62f, 52.74f)
                verticalLineTo(102.26f)
                curveTo(447.83f, 63.57f, 416.43f, 32.0f, 377.74f, 32.0f)
                close()
                moveTo(47.28f, 322.95f)
                curveToRelative(0.99f, 20.17f, 10.25f, 53.73f, 69.93f, 53.73f)
                curveToRelative(52.07f, 0.0f, 92.58f, -39.68f, 117.87f, -72.9f)
                curveToRelative(-44.63f, -18.68f, -84.48f, -31.41f, -109.44f, -31.41f)
                curveToRelative(-67.45f, 0.0f, -79.35f, 33.06f, -78.36f, 50.58f)
                close()
            }
        }
        .build()
        return _alipay!!
    }

private var _alipay: ImageVector? = null
