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

public val IonIcons.LogoChrome: ImageVector
    get() {
        if (_logoChrome != null) {
            return _logoChrome!!
        }
        _logoChrome = Builder(name = "LogoChrome", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.8f, 255.93f)
                arcTo(67.2f, 67.2f, 0.0f, true, false, 256.0f, 188.75f)
                arcTo(67.38f, 67.38f, 0.0f, false, false, 188.8f, 255.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(476.75f, 217.79f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.05f)
                arcToRelative(206.63f, 206.63f, 0.0f, false, false, -7.0f, -28.84f)
                horizontalLineToRelative(-0.11f)
                arcToRelative(202.16f, 202.16f, 0.0f, false, true, 7.07f, 29.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(203.5f, 203.5f, 0.0f, false, false, -7.07f, -29.0f)
                horizontalLineTo(314.24f)
                curveToRelative(19.05f, 17.0f, 31.36f, 40.17f, 31.36f, 67.05f)
                arcToRelative(86.55f, 86.55f, 0.0f, false, true, -12.31f, 44.73f)
                lineTo(231.0f, 478.45f)
                arcToRelative(2.44f, 2.44f, 0.0f, false, true, 0.0f, 0.27f)
                verticalLineTo(479.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.26f)
                arcTo(224.0f, 224.0f, 0.0f, false, false, 256.0f, 480.0f)
                curveToRelative(6.84f, 0.0f, 13.61f, -0.39f, 20.3f, -1.0f)
                arcToRelative(222.91f, 222.91f, 0.0f, false, false, 29.78f, -4.74f)
                curveTo(405.68f, 451.52f, 480.0f, 362.4f, 480.0f, 255.94f)
                arcTo(225.25f, 225.25f, 0.0f, false, false, 476.75f, 217.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 345.5f)
                curveToRelative(-33.6f, 0.0f, -61.6f, -17.91f, -77.29f, -44.79f)
                lineTo(76.0f, 123.05f)
                lineToRelative(-0.14f, -0.24f)
                arcTo(224.0f, 224.0f, 0.0f, false, false, 207.4f, 474.55f)
                lineToRelative(0.0f, -0.05f)
                lineToRelative(77.69f, -134.6f)
                arcTo(84.13f, 84.13f, 0.0f, false, true, 256.0f, 345.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(91.29f, 104.57f)
                lineToRelative(77.35f, 133.25f)
                arcTo(89.19f, 89.19f, 0.0f, false, true, 256.0f, 166.0f)
                horizontalLineTo(461.17f)
                arcToRelative(246.51f, 246.51f, 0.0f, false, false, -25.78f, -43.94f)
                lineToRelative(0.12f, 0.08f)
                arcTo(245.26f, 245.26f, 0.0f, false, true, 461.17f, 166.0f)
                horizontalLineToRelative(0.17f)
                arcToRelative(245.91f, 245.91f, 0.0f, false, false, -25.66f, -44.0f)
                arcToRelative(2.63f, 2.63f, 0.0f, false, true, -0.35f, -0.26f)
                arcTo(223.93f, 223.93f, 0.0f, false, false, 91.14f, 104.34f)
                lineToRelative(0.14f, 0.24f)
                close()
            }
        }
        .build()
        return _logoChrome!!
    }

private var _logoChrome: ImageVector? = null
