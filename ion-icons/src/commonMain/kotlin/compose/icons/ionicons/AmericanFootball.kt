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

public val IonIcons.AmericanFootball: ImageVector
    get() {
        if (_americanFootball != null) {
            return _americanFootball!!
        }
        _americanFootball = Builder(name = "AmericanFootball", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.06f, 122.06f)
                curveToRelative(-44.37f, 44.37f, -66.71f, 100.61f, -78.0f, 145.28f)
                lineTo(244.66f, 467.9f)
                curveToRelative(44.67f, -11.25f, 100.91f, -33.59f, 145.28f, -78.0f)
                reflectiveCurveToRelative(66.71f, -100.61f, 78.0f, -145.28f)
                lineTo(267.34f, 44.1f)
                curveTo(222.67f, 55.35f, 166.43f, 77.69f, 122.06f, 122.06f)
                close()
                moveTo(378.79f, 378.78f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(300.65f, 189.0f)
                lineTo(323.0f, 166.71f)
                arcTo(15.78f, 15.78f, 0.0f, false, true, 345.29f, 189.0f)
                lineTo(323.0f, 211.35f)
                lineToRelative(11.16f, 11.17f)
                arcToRelative(15.78f, 15.78f, 0.0f, false, true, -22.32f, 22.32f)
                lineToRelative(-11.16f, -11.16f)
                lineTo(278.32f, 256.0f)
                lineToRelative(11.16f, 11.16f)
                arcToRelative(15.78f, 15.78f, 0.0f, true, true, -22.32f, 22.32f)
                lineTo(256.0f, 278.32f)
                lineToRelative(-22.32f, 22.33f)
                lineToRelative(11.16f, 11.16f)
                arcToRelative(15.78f, 15.78f, 0.0f, true, true, -22.32f, 22.32f)
                lineTo(211.35f, 323.0f)
                lineTo(189.0f, 345.29f)
                arcTo(15.78f, 15.78f, 0.0f, false, true, 166.71f, 323.0f)
                lineTo(189.0f, 300.65f)
                lineToRelative(-11.16f, -11.17f)
                arcToRelative(15.78f, 15.78f, 0.0f, false, true, 22.32f, -22.32f)
                lineToRelative(11.16f, 11.16f)
                lineTo(233.68f, 256.0f)
                lineToRelative(-11.16f, -11.16f)
                arcToRelative(15.78f, 15.78f, 0.0f, true, true, 22.32f, -22.32f)
                lineTo(256.0f, 233.68f)
                lineToRelative(22.32f, -22.33f)
                lineToRelative(-11.16f, -11.16f)
                arcToRelative(15.78f, 15.78f, 0.0f, false, true, 22.32f, -22.32f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(476.57f, 199.63f)
                curveToRelative(7.31f, -54.53f, 4.0f, -120.26f, -20.0f, -144.21f)
                reflectiveCurveToRelative(-89.68f, -27.3f, -144.21f, -20.0f)
                curveToRelative(-2.51f, 0.34f, -5.16f, 0.72f, -7.91f, 1.15f)
                lineToRelative(171.0f, 171.0f)
                curveTo(475.85f, 204.79f, 476.23f, 202.14f, 476.57f, 199.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.43f, 312.37f)
                curveToRelative(-7.31f, 54.53f, -4.0f, 120.26f, 20.0f, 144.21f)
                curveTo(72.17f, 473.33f, 109.34f, 480.0f, 148.84f, 480.0f)
                arcToRelative(387.0f, 387.0f, 0.0f, false, false, 50.79f, -3.43f)
                curveToRelative(2.51f, -0.34f, 5.16f, -0.72f, 7.91f, -1.15f)
                lineToRelative(-171.0f, -171.0f)
                curveTo(36.15f, 307.21f, 35.77f, 309.86f, 35.43f, 312.37f)
                close()
            }
        }
        .build()
        return _americanFootball!!
    }

private var _americanFootball: ImageVector? = null
