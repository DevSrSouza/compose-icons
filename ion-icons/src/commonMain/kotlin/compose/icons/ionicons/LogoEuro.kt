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

public val IonIcons.LogoEuro: ImageVector
    get() {
        if (_logoEuro != null) {
            return _logoEuro!!
        }
        _logoEuro = Builder(name = "LogoEuro", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.8f, 272.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(376.0f)
                lineToRelative(8.0f, -48.0f)
                horizontalLineTo(231.8f)
                verticalLineToRelative(-8.12f)
                curveToRelative(0.0f, -38.69f, 16.47f, -62.56f, 87.18f, -62.56f)
                curveToRelative(28.89f, 0.0f, 61.45f, 2.69f, 102.5f, 9.42f)
                lineToRelative(10.52f, -70.0f)
                arcTo(508.54f, 508.54f, 0.0f, false, false, 315.46f, 32.0f)
                curveTo(189.26f, 32.0f, 135.0f, 76.4f, 135.0f, 158.46f)
                verticalLineTo(176.0f)
                lineToRelative(-55.0f, 0.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(55.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(80.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(55.0f)
                verticalLineToRelative(33.54f)
                curveTo(135.0f, 435.6f, 189.23f, 480.0f, 315.43f, 480.0f)
                arcToRelative(507.76f, 507.76f, 0.0f, false, false, 116.44f, -12.78f)
                lineToRelative(-10.58f, -70.0f)
                curveToRelative(-41.05f, 6.73f, -73.46f, 9.42f, -102.35f, 9.42f)
                curveToRelative(-70.7f, 0.0f, -87.14f, -20.18f, -87.14f, -67.94f)
                verticalLineTo(320.0f)
                horizontalLineTo(360.27f)
                lineToRelative(7.87f, -48.0f)
                close()
            }
        }
        .build()
        return _logoEuro!!
    }

private var _logoEuro: ImageVector? = null
