package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.NetworkWired: ImageVector
    get() {
        if (_networkWired != null) {
            return _networkWired!!
        }
        _networkWired = Builder(name = "NetworkWired", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(640.0f, 264.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                lineTo(344.0f, 232.0f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(72.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(448.0f, 32.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                lineTo(224.0f, 0.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(128.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(40.0f)
                lineTo(16.0f, 232.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(104.0f)
                verticalLineToRelative(40.0f)
                lineTo(64.0f, 320.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(128.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(160.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(256.0f, 352.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-56.0f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(304.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(-56.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(128.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(160.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(608.0f, 352.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-56.0f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(104.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                close()
                moveTo(256.0f, 128.0f)
                lineTo(256.0f, 64.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(64.0f)
                lineTo(256.0f, 128.0f)
                close()
                moveTo(192.0f, 448.0f)
                lineTo(96.0f, 448.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(544.0f, 448.0f)
                horizontalLineToRelative(-96.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _networkWired!!
    }

private var _networkWired: ImageVector? = null
