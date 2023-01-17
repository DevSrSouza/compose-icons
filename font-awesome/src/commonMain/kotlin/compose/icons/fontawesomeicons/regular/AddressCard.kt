package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.AddressCard: ImageVector
    get() {
        if (_addressCard != null) {
            return _addressCard!!
        }
        _addressCard = Builder(name = "AddressCard", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 256.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                curveToRelative(0.0f, -35.35f, -28.65f, -64.0f, -64.0f, -64.0f)
                reflectiveCurveToRelative(-64.0f, 28.65f, -64.0f, 64.0f)
                curveTo(144.0f, 227.3f, 172.7f, 256.0f, 208.0f, 256.0f)
                close()
                moveTo(464.0f, 232.0f)
                horizontalLineToRelative(-96.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, 10.75f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                reflectiveCurveTo(477.3f, 232.0f, 464.0f, 232.0f)
                close()
                moveTo(240.0f, 288.0f)
                horizontalLineToRelative(-64.0f)
                curveTo(131.8f, 288.0f, 96.0f, 323.8f, 96.0f, 368.0f)
                curveTo(96.0f, 376.8f, 103.2f, 384.0f, 112.0f, 384.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(8.836f, 0.0f, 16.0f, -7.164f, 16.0f, -16.0f)
                curveTo(320.0f, 323.8f, 284.2f, 288.0f, 240.0f, 288.0f)
                close()
                moveTo(464.0f, 152.0f)
                horizontalLineToRelative(-96.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, 10.75f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                reflectiveCurveTo(477.3f, 152.0f, 464.0f, 152.0f)
                close()
                moveTo(512.0f, 32.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 32.0f, 0.0f, 60.65f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(448.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveTo(576.0f, 60.65f, 547.3f, 32.0f, 512.0f, 32.0f)
                close()
                moveTo(528.0f, 416.0f)
                curveToRelative(0.0f, 8.822f, -7.178f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-8.822f, 0.0f, -16.0f, -7.178f, -16.0f, -16.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -8.822f, 7.178f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(448.0f)
                curveToRelative(8.822f, 0.0f, 16.0f, 7.178f, 16.0f, 16.0f)
                verticalLineTo(416.0f)
                close()
            }
        }
        .build()
        return _addressCard!!
    }

private var _addressCard: ImageVector? = null
