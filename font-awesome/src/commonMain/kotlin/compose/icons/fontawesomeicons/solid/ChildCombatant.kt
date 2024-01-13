package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ChildCombatant: ImageVector
    get() {
        if (_childCombatant != null) {
            return _childCombatant!!
        }
        _childCombatant = Builder(name = "ChildCombatant", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 128.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 176.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, 128.0f)
                close()
                moveTo(168.0f, 480.0f)
                lineTo(168.0f, 352.0f)
                horizontalLineToRelative(16.0f)
                lineTo(184.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(248.0f, 300.5f)
                lineTo(260.9f, 321.0f)
                curveToRelative(9.4f, 15.0f, 29.2f, 19.4f, 44.1f, 10.0f)
                reflectiveCurveToRelative(19.4f, -29.2f, 10.0f, -44.1f)
                lineToRelative(-51.7f, -82.1f)
                curveToRelative(-17.6f, -27.9f, -48.3f, -44.9f, -81.2f, -44.9f)
                lineTo(169.8f, 159.9f)
                curveToRelative(-33.0f, 0.0f, -63.7f, 16.9f, -81.2f, 44.9f)
                lineTo(36.9f, 287.0f)
                curveToRelative(-9.4f, 15.0f, -4.9f, 34.7f, 10.0f, 44.1f)
                reflectiveCurveToRelative(34.7f, 4.9f, 44.1f, -10.0f)
                lineTo(104.0f, 300.5f)
                lineTo(104.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                close()
                moveTo(448.0f, 0.0f)
                lineTo(432.0f, 0.0f)
                lineTo(416.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineTo(416.0f, 132.3f)
                curveToRelative(-9.6f, 5.5f, -16.0f, 15.9f, -16.0f, 27.7f)
                verticalLineToRelative(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(368.0f, 368.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(59.5f)
                curveToRelative(10.4f, 0.0f, 18.0f, -9.8f, 15.5f, -19.9f)
                lineTo(484.0f, 400.0f)
                horizontalLineToRelative(44.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(544.0f, 368.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(480.0f, 352.0f)
                lineTo(480.0f, 325.3f)
                lineToRelative(53.1f, -17.7f)
                curveToRelative(6.5f, -2.2f, 10.9f, -8.3f, 10.9f, -15.2f)
                lineTo(544.0f, 208.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(512.0f, 192.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(56.0f)
                lineToRelative(-16.0f, 5.3f)
                lineTo(480.0f, 160.0f)
                curveToRelative(0.0f, -11.8f, -6.4f, -22.2f, -16.0f, -27.7f)
                lineTo(464.0f, 16.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _childCombatant!!
    }

private var _childCombatant: ImageVector? = null
