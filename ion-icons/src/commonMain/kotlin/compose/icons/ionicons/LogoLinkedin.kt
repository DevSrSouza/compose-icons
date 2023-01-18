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

public val IonIcons.LogoLinkedin: ImageVector
    get() {
        if (_logoLinkedin != null) {
            return _logoLinkedin!!
        }
        _logoLinkedin = Builder(name = "LogoLinkedin", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(444.17f, 32.0f)
                horizontalLineTo(70.28f)
                curveTo(49.85f, 32.0f, 32.0f, 46.7f, 32.0f, 66.89f)
                verticalLineTo(441.61f)
                curveTo(32.0f, 461.91f, 49.85f, 480.0f, 70.28f, 480.0f)
                horizontalLineTo(444.06f)
                curveTo(464.6f, 480.0f, 480.0f, 461.79f, 480.0f, 441.61f)
                verticalLineTo(66.89f)
                curveTo(480.12f, 46.7f, 464.6f, 32.0f, 444.17f, 32.0f)
                close()
                moveTo(170.87f, 405.43f)
                horizontalLineTo(106.69f)
                verticalLineTo(205.88f)
                horizontalLineToRelative(64.18f)
                close()
                moveTo(141.0f, 175.54f)
                horizontalLineToRelative(-0.46f)
                curveToRelative(-20.54f, 0.0f, -33.84f, -15.29f, -33.84f, -34.43f)
                curveToRelative(0.0f, -19.49f, 13.65f, -34.42f, 34.65f, -34.42f)
                reflectiveCurveToRelative(33.85f, 14.82f, 34.31f, 34.42f)
                curveTo(175.65f, 160.25f, 162.35f, 175.54f, 141.0f, 175.54f)
                close()
                moveTo(405.43f, 405.43f)
                horizontalLineTo(341.25f)
                verticalLineTo(296.32f)
                curveToRelative(0.0f, -26.14f, -9.34f, -44.0f, -32.56f, -44.0f)
                curveToRelative(-17.74f, 0.0f, -28.24f, 12.0f, -32.91f, 23.69f)
                curveToRelative(-1.75f, 4.2f, -2.22f, 9.92f, -2.22f, 15.76f)
                verticalLineTo(405.43f)
                horizontalLineTo(209.38f)
                verticalLineTo(205.88f)
                horizontalLineToRelative(64.18f)
                verticalLineToRelative(27.77f)
                curveToRelative(9.34f, -13.3f, 23.93f, -32.44f, 57.88f, -32.44f)
                curveToRelative(42.13f, 0.0f, 74.0f, 27.77f, 74.0f, 87.64f)
                close()
            }
        }
        .build()
        return _logoLinkedin!!
    }

private var _logoLinkedin: ImageVector? = null
