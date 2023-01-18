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

public val IonIcons.DiceSharp: ImageVector
    get() {
        if (_diceSharp != null) {
            return _diceSharp!!
        }
        _diceSharp = Builder(name = "DiceSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 366.92f)
                lineTo(240.0f, 480.0f)
                verticalLineTo(284.0f)
                lineTo(48.0f, 170.0f)
                close()
                moveTo(192.0f, 288.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 10.75f, 16.0f, 24.0f)
                reflectiveCurveToRelative(-7.16f, 24.0f, -16.0f, 24.0f)
                reflectiveCurveToRelative(-16.0f, -10.75f, -16.0f, -24.0f)
                reflectiveCurveTo(183.16f, 288.0f, 192.0f, 288.0f)
                close()
                moveTo(96.0f, 320.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 10.75f, 16.0f, 24.0f)
                reflectiveCurveToRelative(-7.16f, 24.0f, -16.0f, 24.0f)
                reflectiveCurveToRelative(-16.0f, -10.75f, -16.0f, -24.0f)
                reflectiveCurveTo(87.16f, 320.0f, 96.0f, 320.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 284.0f)
                lineTo(272.0f, 480.0f)
                lineTo(464.0f, 366.92f)
                lineTo(464.0f, 170.0f)
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
                moveTo(448.0f, 357.64f)
                horizontalLineToRelative(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                lineTo(64.0f, 144.0f)
                lineTo(256.0f, 256.0f)
                lineTo(448.0f, 144.0f)
                close()
                moveTo(256.0f, 152.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, -7.16f, -24.0f, -16.0f)
                reflectiveCurveToRelative(10.75f, -16.0f, 24.0f, -16.0f)
                reflectiveCurveToRelative(24.0f, 7.16f, 24.0f, 16.0f)
                reflectiveCurveTo(269.25f, 152.0f, 256.0f, 152.0f)
                close()
            }
        }
        .build()
        return _diceSharp!!
    }

private var _diceSharp: ImageVector? = null
