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

public val SolidGroup.JetFighterUp: ImageVector
    get() {
        if (_jetFighterUp != null) {
            return _jetFighterUp!!
        }
        _jetFighterUp = Builder(name = "JetFighterUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(270.7f, 9.7f)
                curveTo(268.2f, 3.8f, 262.4f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(-12.2f, 3.8f, -14.7f, 9.7f)
                lineTo(197.2f, 112.6f)
                curveToRelative(-3.4f, 8.0f, -5.2f, 16.5f, -5.2f, 25.2f)
                verticalLineToRelative(77.0f)
                lineToRelative(-144.0f, 84.0f)
                verticalLineTo(280.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineToRelative(56.0f)
                verticalLineToRelative(32.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(192.0f)
                verticalLineToRelative(32.7f)
                lineTo(133.5f, 468.0f)
                curveToRelative(-3.5f, 3.0f, -5.5f, 7.4f, -5.5f, 12.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, -4.6f, -2.0f, -9.0f, -5.5f, -12.0f)
                lineTo(320.0f, 416.7f)
                verticalLineTo(384.0f)
                horizontalLineTo(464.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineTo(368.0f)
                verticalLineTo(336.0f)
                verticalLineTo(280.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineToRelative(18.8f)
                lineToRelative(-144.0f, -84.0f)
                verticalLineToRelative(-77.0f)
                curveToRelative(0.0f, -8.7f, -1.8f, -17.2f, -5.2f, -25.2f)
                lineTo(270.7f, 9.7f)
                close()
            }
        }
        .build()
        return _jetFighterUp!!
    }

private var _jetFighterUp: ImageVector? = null
