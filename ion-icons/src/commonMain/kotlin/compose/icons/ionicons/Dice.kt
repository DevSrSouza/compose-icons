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

public val IonIcons.Dice: ImageVector
    get() {
        if (_dice != null) {
            return _dice!!
        }
        _dice = Builder(name = "Dice", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(440.88f, 129.37f)
                lineTo(288.16f, 40.62f)
                arcToRelative(64.14f, 64.14f, 0.0f, false, false, -64.33f, 0.0f)
                lineTo(71.12f, 129.37f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.9f)
                lineTo(254.0f, 243.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.06f, 0.0f)
                lineTo(440.9f, 136.27f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 440.88f, 129.37f)
                close()
                moveTo(256.0f, 152.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, -7.16f, -24.0f, -16.0f)
                reflectiveCurveToRelative(10.75f, -16.0f, 24.0f, -16.0f)
                reflectiveCurveToRelative(24.0f, 7.16f, 24.0f, 16.0f)
                reflectiveCurveTo(269.25f, 152.0f, 256.0f, 152.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 270.81f)
                lineTo(54.0f, 163.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, 3.46f)
                lineTo(48.0f, 340.86f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 23.84f, 41.39f)
                lineTo(234.0f, 479.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, -3.46f)
                lineTo(240.0f, 274.27f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 238.0f, 270.81f)
                close()
                moveTo(96.0f, 368.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -10.75f, -16.0f, -24.0f)
                reflectiveCurveToRelative(7.16f, -24.0f, 16.0f, -24.0f)
                reflectiveCurveToRelative(16.0f, 10.75f, 16.0f, 24.0f)
                reflectiveCurveTo(104.84f, 368.0f, 96.0f, 368.0f)
                close()
                moveTo(192.0f, 336.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -10.75f, -16.0f, -24.0f)
                reflectiveCurveToRelative(7.16f, -24.0f, 16.0f, -24.0f)
                reflectiveCurveToRelative(16.0f, 10.75f, 16.0f, 24.0f)
                reflectiveCurveTo(200.84f, 336.0f, 192.0f, 336.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(458.0f, 163.51f)
                lineTo(274.0f, 271.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, 3.45f)
                lineTo(272.0f, 476.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, 3.46f)
                lineToRelative(162.15f, -97.23f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 464.0f, 340.86f)
                lineTo(464.0f, 167.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 458.0f, 163.51f)
                close()
                moveTo(320.0f, 424.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -10.75f, -16.0f, -24.0f)
                reflectiveCurveToRelative(7.16f, -24.0f, 16.0f, -24.0f)
                reflectiveCurveToRelative(16.0f, 10.75f, 16.0f, 24.0f)
                reflectiveCurveTo(328.84f, 424.0f, 320.0f, 424.0f)
                close()
                moveTo(320.0f, 336.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -10.75f, -16.0f, -24.0f)
                reflectiveCurveToRelative(7.16f, -24.0f, 16.0f, -24.0f)
                reflectiveCurveToRelative(16.0f, 10.75f, 16.0f, 24.0f)
                reflectiveCurveTo(328.84f, 336.0f, 320.0f, 336.0f)
                close()
                moveTo(416.0f, 368.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -10.75f, -16.0f, -24.0f)
                reflectiveCurveToRelative(7.16f, -24.0f, 16.0f, -24.0f)
                reflectiveCurveToRelative(16.0f, 10.75f, 16.0f, 24.0f)
                reflectiveCurveTo(424.84f, 368.0f, 416.0f, 368.0f)
                close()
                moveTo(416.0f, 280.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -10.75f, -16.0f, -24.0f)
                reflectiveCurveToRelative(7.16f, -24.0f, 16.0f, -24.0f)
                reflectiveCurveToRelative(16.0f, 10.75f, 16.0f, 24.0f)
                reflectiveCurveTo(424.84f, 280.0f, 416.0f, 280.0f)
                close()
            }
        }
        .build()
        return _dice!!
    }

private var _dice: ImageVector? = null
