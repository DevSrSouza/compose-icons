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

public val SolidGroup.HouseMedicalCircleCheck: ImageVector
    get() {
        if (_houseMedicalCircleCheck != null) {
            return _houseMedicalCircleCheck!!
        }
        _houseMedicalCircleCheck = Builder(name = "HouseMedicalCircleCheck", defaultWidth =
                640.0.dp, defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 368.0f)
                curveToRelative(0.0f, 59.5f, 29.5f, 112.1f, 74.8f, 144.0f)
                lineTo(128.1f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(64.1f, 287.6f)
                lineTo(32.0f, 287.6f)
                curveToRelative(-18.0f, 0.0f, -32.0f, -14.0f, -32.0f, -32.1f)
                curveToRelative(0.0f, -9.0f, 3.0f, -17.0f, 10.0f, -24.0f)
                lineTo(266.4f, 8.0f)
                curveToRelative(7.0f, -7.0f, 15.0f, -8.0f, 22.0f, -8.0f)
                reflectiveCurveToRelative(15.0f, 2.0f, 21.0f, 7.0f)
                lineTo(522.1f, 193.9f)
                curveToRelative(-8.5f, -1.3f, -17.3f, -1.9f, -26.1f, -1.9f)
                curveToRelative(-54.7f, 0.0f, -103.5f, 24.9f, -135.8f, 64.0f)
                lineTo(320.0f, 256.0f)
                lineTo(320.0f, 208.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(272.0f, 192.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                lineTo(208.0f, 256.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                close()
                moveTo(352.0f, 368.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, -288.0f, 0.0f)
                close()
                moveTo(563.3f, 324.7f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                lineTo(480.0f, 385.4f)
                lineToRelative(-28.7f, -28.7f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, 16.4f, 0.0f, 22.6f)
                lineToRelative(40.0f, 40.0f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0.0f)
                lineToRelative(72.0f, -72.0f)
                curveToRelative(6.2f, -6.2f, 6.2f, -16.4f, 0.0f, -22.6f)
                close()
            }
        }
        .build()
        return _houseMedicalCircleCheck!!
    }

private var _houseMedicalCircleCheck: ImageVector? = null
