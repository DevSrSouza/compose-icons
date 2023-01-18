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

public val IonIcons.Alarm: ImageVector
    get() {
        if (_alarm != null) {
            return _alarm!!
        }
        _alarm = Builder(name = "Alarm", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(153.59f, 110.46f)
                arcTo(21.41f, 21.41f, 0.0f, false, false, 152.48f, 79.0f)
                horizontalLineToRelative(0.0f)
                arcTo(62.67f, 62.67f, 0.0f, false, false, 112.0f, 64.0f)
                lineToRelative(-3.27f, 0.09f)
                lineToRelative(-0.48f, 0.0f)
                curveTo(74.4f, 66.15f, 48.0f, 95.55f, 48.07f, 131.0f)
                curveToRelative(0.0f, 19.0f, 8.0f, 29.06f, 14.32f, 37.11f)
                arcToRelative(20.61f, 20.61f, 0.0f, false, false, 14.7f, 7.8f)
                curveToRelative(0.26f, 0.0f, 0.7f, 0.05f, 2.0f, 0.05f)
                arcToRelative(19.06f, 19.06f, 0.0f, false, false, 13.75f, -5.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(403.79f, 64.11f)
                lineToRelative(-3.27f, -0.1f)
                horizontalLineTo(400.0f)
                arcToRelative(62.67f, 62.67f, 0.0f, false, false, -40.52f, 15.0f)
                arcToRelative(21.41f, 21.41f, 0.0f, false, false, -1.11f, 31.44f)
                lineToRelative(60.77f, 59.65f)
                arcTo(19.06f, 19.06f, 0.0f, false, false, 432.93f, 176.0f)
                curveToRelative(1.28f, 0.0f, 1.72f, 0.0f, 2.0f, -0.05f)
                arcToRelative(20.61f, 20.61f, 0.0f, false, false, 14.69f, -7.8f)
                curveToRelative(6.36f, -8.05f, 14.28f, -18.08f, 14.32f, -37.11f)
                curveTo(464.0f, 95.55f, 437.6f, 66.15f, 403.79f, 64.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.07f, 96.0f)
                curveToRelative(-97.0f, 0.0f, -176.0f, 78.95f, -176.0f, 176.0f)
                arcToRelative(175.23f, 175.23f, 0.0f, false, false, 40.81f, 112.56f)
                lineTo(84.76f, 420.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 22.63f, 22.62f)
                lineToRelative(36.12f, -36.12f)
                arcToRelative(175.63f, 175.63f, 0.0f, false, false, 225.12f, 0.0f)
                lineToRelative(36.13f, 36.12f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 22.63f, -22.62f)
                lineToRelative(-36.13f, -36.13f)
                arcTo(175.17f, 175.17f, 0.0f, false, false, 432.07f, 272.0f)
                curveTo(432.07f, 175.0f, 353.12f, 96.0f, 256.07f, 96.0f)
                close()
                moveTo(272.07f, 272.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineToRelative(-80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                horizontalLineToRelative(64.0f)
                lineTo(240.07f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _alarm!!
    }

private var _alarm: ImageVector? = null
