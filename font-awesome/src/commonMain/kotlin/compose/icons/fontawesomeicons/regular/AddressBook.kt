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

public val RegularGroup.AddressBook: ImageVector
    get() {
        if (_addressBook != null) {
            return _addressBook!!
        }
        _addressBook = Builder(name = "AddressBook", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 288.0f)
                horizontalLineToRelative(-64.0f)
                curveTo(163.8f, 288.0f, 128.0f, 323.8f, 128.0f, 368.0f)
                curveTo(128.0f, 376.8f, 135.2f, 384.0f, 144.0f, 384.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(8.836f, 0.0f, 16.0f, -7.164f, 16.0f, -16.0f)
                curveTo(352.0f, 323.8f, 316.2f, 288.0f, 272.0f, 288.0f)
                close()
                moveTo(240.0f, 256.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.65f, -64.0f, -64.0f, -64.0f)
                curveToRelative(-35.34f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
                reflectiveCurveTo(204.7f, 256.0f, 240.0f, 256.0f)
                close()
                moveTo(496.0f, 320.0f)
                horizontalLineTo(480.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.836f, 0.0f, 16.0f, -7.164f, 16.0f, -16.0f)
                verticalLineToRelative(-64.0f)
                curveTo(512.0f, 327.2f, 504.8f, 320.0f, 496.0f, 320.0f)
                close()
                moveTo(496.0f, 64.0f)
                horizontalLineTo(480.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(16.0f)
                curveTo(504.8f, 160.0f, 512.0f, 152.8f, 512.0f, 144.0f)
                verticalLineToRelative(-64.0f)
                curveTo(512.0f, 71.16f, 504.8f, 64.0f, 496.0f, 64.0f)
                close()
                moveTo(496.0f, 192.0f)
                horizontalLineTo(480.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(16.0f)
                curveTo(504.8f, 288.0f, 512.0f, 280.8f, 512.0f, 272.0f)
                verticalLineToRelative(-64.0f)
                curveTo(512.0f, 199.2f, 504.8f, 192.0f, 496.0f, 192.0f)
                close()
                moveTo(384.0f, 0.0f)
                horizontalLineTo(96.0f)
                curveTo(60.65f, 0.0f, 32.0f, 28.65f, 32.0f, 64.0f)
                verticalLineToRelative(384.0f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                verticalLineTo(64.0f)
                curveTo(448.0f, 28.65f, 419.3f, 0.0f, 384.0f, 0.0f)
                close()
                moveTo(400.0f, 448.0f)
                curveToRelative(0.0f, 8.836f, -7.164f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-8.836f, 0.0f, -16.0f, -7.164f, -16.0f, -16.0f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -8.838f, 7.164f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(8.836f, 0.0f, 16.0f, 7.162f, 16.0f, 16.0f)
                verticalLineTo(448.0f)
                close()
            }
        }
        .build()
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
