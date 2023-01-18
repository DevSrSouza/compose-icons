package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoPaypal: ImageVector
    get() {
        if (_logoPaypal != null) {
            return _logoPaypal!!
        }
        _logoPaypal = Builder(name = "LogoPaypal", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(424.81f, 148.79f)
                curveToRelative(-0.43f, 2.76f, -0.93f, 5.58f, -1.49f, 8.48f)
                curveToRelative(-19.17f, 98.0f, -84.76f, 131.8f, -168.54f, 131.8f)
                horizontalLineTo(212.13f)
                arcToRelative(20.67f, 20.67f, 0.0f, false, false, -20.47f, 17.46f)
                lineTo(169.82f, 444.37f)
                lineToRelative(-6.18f, 39.07f)
                arcToRelative(10.86f, 10.86f, 0.0f, false, false, 9.07f, 12.42f)
                arcToRelative(10.72f, 10.72f, 0.0f, false, false, 1.7f, 0.13f)
                horizontalLineToRelative(75.65f)
                arcToRelative(18.18f, 18.18f, 0.0f, false, false, 18.0f, -15.27f)
                lineToRelative(0.74f, -3.83f)
                lineToRelative(14.24f, -90.0f)
                lineToRelative(0.91f, -4.94f)
                arcToRelative(18.16f, 18.16f, 0.0f, false, true, 18.0f, -15.3f)
                horizontalLineToRelative(11.31f)
                curveToRelative(73.3f, 0.0f, 130.67f, -29.62f, 147.44f, -115.32f)
                curveToRelative(7.0f, -35.8f, 3.38f, -65.69f, -15.16f, -86.72f)
                arcTo(72.27f, 72.27f, 0.0f, false, false, 424.81f, 148.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(385.52f, 51.09f)
                curveTo(363.84f, 26.52f, 324.71f, 16.0f, 274.63f, 16.0f)
                horizontalLineTo(129.25f)
                arcToRelative(20.75f, 20.75f, 0.0f, false, false, -20.54f, 17.48f)
                lineToRelative(-60.55f, 382.0f)
                arcToRelative(12.43f, 12.43f, 0.0f, false, false, 10.39f, 14.22f)
                arcToRelative(12.58f, 12.58f, 0.0f, false, false, 1.94f, 0.15f)
                horizontalLineToRelative(89.76f)
                lineToRelative(22.54f, -142.29f)
                lineToRelative(-0.7f, 4.46f)
                arcToRelative(20.67f, 20.67f, 0.0f, false, true, 20.47f, -17.46f)
                horizontalLineToRelative(42.65f)
                curveToRelative(83.77f, 0.0f, 149.36f, -33.86f, 168.54f, -131.8f)
                curveToRelative(0.57f, -2.9f, 1.05f, -5.72f, 1.49f, -8.48f)
                horizontalLineToRelative(0.0f)
                curveTo(410.94f, 98.06f, 405.19f, 73.41f, 385.52f, 51.09f)
                close()
            }
        }
        .build()
        return _logoPaypal!!
    }

private var _logoPaypal: ImageVector? = null
