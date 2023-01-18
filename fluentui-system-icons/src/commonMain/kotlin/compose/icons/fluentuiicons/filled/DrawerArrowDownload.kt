package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.DrawerArrowDownload: ImageVector
    get() {
        if (_drawerArrowDownload != null) {
            return _drawerArrowDownload!!
        }
        _drawerArrowDownload = Builder(name = "DrawerArrowDownload", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.501f)
                curveTo(11.0f, 3.632f, 13.1967f, 1.276f, 16.0f, 1.0234f)
                verticalLineTo(6.7939f)
                lineTo(14.3536f, 5.1474f)
                curveTo(14.1583f, 4.9522f, 13.8417f, 4.9522f, 13.6464f, 5.1474f)
                curveTo(13.4512f, 5.3427f, 13.4512f, 5.6593f, 13.6464f, 5.8545f)
                lineTo(16.1464f, 8.3545f)
                curveTo(16.3417f, 8.5498f, 16.6583f, 8.5498f, 16.8536f, 8.3545f)
                lineTo(19.3536f, 5.8545f)
                curveTo(19.5488f, 5.6593f, 19.5488f, 5.3427f, 19.3536f, 5.1474f)
                curveTo(19.1583f, 4.9522f, 18.8417f, 4.9522f, 18.6464f, 5.1474f)
                lineTo(17.0f, 6.7939f)
                verticalLineTo(1.0234f)
                curveTo(19.8032f, 1.276f, 22.0f, 3.632f, 22.0f, 6.501f)
                curveTo(22.0f, 9.5386f, 19.5376f, 12.001f, 16.5f, 12.001f)
                curveTo(13.4624f, 12.001f, 11.0f, 9.5386f, 11.0f, 6.501f)
                close()
                moveTo(19.5f, 9.501f)
                curveTo(19.5f, 9.2248f, 19.2761f, 9.001f, 19.0f, 9.001f)
                horizontalLineTo(14.0f)
                curveTo(13.7239f, 9.001f, 13.5f, 9.2248f, 13.5f, 9.501f)
                curveTo(13.5f, 9.7771f, 13.7239f, 10.001f, 14.0f, 10.001f)
                horizontalLineTo(19.0f)
                curveTo(19.2761f, 10.001f, 19.5f, 9.7771f, 19.5f, 9.501f)
                close()
                moveTo(6.25f, 4.001f)
                horizontalLineTo(10.4982f)
                curveTo(10.3004f, 4.4752f, 10.1572f, 4.9778f, 10.0764f, 5.501f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 5.501f, 4.5f, 6.2845f, 4.5f, 7.251f)
                verticalLineTo(8.001f)
                horizontalLineTo(10.1739f)
                curveTo(10.2986f, 8.5288f, 10.4876f, 9.0317f, 10.7322f, 9.501f)
                horizontalLineTo(4.5f)
                verticalLineTo(14.001f)
                horizontalLineTo(9.0577f)
                curveTo(9.44f, 14.001f, 9.75f, 14.3109f, 9.75f, 14.6933f)
                verticalLineTo(14.751f)
                curveTo(9.75f, 15.9936f, 10.7574f, 17.001f, 12.0f, 17.001f)
                curveTo(13.2426f, 17.001f, 14.25f, 15.9936f, 14.25f, 14.751f)
                verticalLineTo(14.6933f)
                curveTo(14.25f, 14.3109f, 14.56f, 14.001f, 14.9423f, 14.001f)
                horizontalLineTo(19.5f)
                verticalLineTo(12.2688f)
                curveTo(20.051f, 11.9816f, 20.5557f, 11.6177f, 21.0f, 11.1914f)
                verticalLineTo(18.751f)
                curveTo(21.0f, 20.5459f, 19.5449f, 22.001f, 17.75f, 22.001f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 22.001f, 3.0f, 20.5459f, 3.0f, 18.751f)
                verticalLineTo(7.251f)
                curveTo(3.0f, 5.456f, 4.4551f, 4.001f, 6.25f, 4.001f)
                close()
            }
        }
        .build()
        return _drawerArrowDownload!!
    }

private var _drawerArrowDownload: ImageVector? = null
