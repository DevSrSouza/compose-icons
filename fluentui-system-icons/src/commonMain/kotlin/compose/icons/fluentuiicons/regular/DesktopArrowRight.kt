package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.DesktopArrowRight: ImageVector
    get() {
        if (_desktopArrowRight != null) {
            return _desktopArrowRight!!
        }
        _desktopArrowRight = Builder(name = "DesktopArrowRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 6.5f)
                curveTo(23.0f, 9.5376f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 9.5376f, 12.0f, 6.5f)
                curveTo(12.0f, 3.4624f, 14.4624f, 1.0f, 17.5f, 1.0f)
                curveTo(20.5376f, 1.0f, 23.0f, 3.4624f, 23.0f, 6.5f)
                close()
                moveTo(14.5f, 6.0f)
                curveTo(14.2239f, 6.0f, 14.0f, 6.2239f, 14.0f, 6.5f)
                curveTo(14.0f, 6.7761f, 14.2239f, 7.0f, 14.5f, 7.0f)
                lineTo(19.2929f, 7.0f)
                lineTo(17.6464f, 8.6465f)
                curveTo(17.4512f, 8.8417f, 17.4512f, 9.1583f, 17.6464f, 9.3535f)
                curveTo(17.8417f, 9.5488f, 18.1583f, 9.5488f, 18.3536f, 9.3535f)
                lineTo(20.8536f, 6.8535f)
                curveTo(21.0488f, 6.6583f, 21.0488f, 6.3417f, 20.8536f, 6.1465f)
                lineTo(18.3536f, 3.6465f)
                curveTo(18.1583f, 3.4512f, 17.8417f, 3.4512f, 17.6464f, 3.6465f)
                curveTo(17.4512f, 3.8417f, 17.4512f, 4.1583f, 17.6464f, 4.3535f)
                lineTo(19.2929f, 6.0f)
                lineTo(14.5f, 6.0f)
                close()
                moveTo(20.4988f, 15.7518f)
                verticalLineTo(12.2684f)
                curveTo(21.0498f, 11.9814f, 21.5545f, 11.6177f, 21.9988f, 11.1915f)
                verticalLineTo(15.7518f)
                curveTo(21.9988f, 16.9427f, 21.0737f, 17.9175f, 19.9029f, 17.9967f)
                lineTo(19.7488f, 18.0018f)
                lineTo(15.499f, 18.0016f)
                verticalLineTo(20.4996f)
                lineTo(17.25f, 20.5f)
                curveTo(17.6642f, 20.5f, 18.0f, 20.8358f, 18.0f, 21.25f)
                curveTo(18.0f, 21.6297f, 17.7178f, 21.9435f, 17.3518f, 21.9932f)
                lineTo(17.25f, 22.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 22.0f, 6.0f, 21.6642f, 6.0f, 21.25f)
                curveTo(6.0f, 20.8703f, 6.2821f, 20.5565f, 6.6482f, 20.5069f)
                lineTo(6.75f, 20.5f)
                lineTo(8.499f, 20.4996f)
                verticalLineTo(18.0016f)
                lineTo(4.25f, 18.0018f)
                curveTo(3.0591f, 18.0018f, 2.0844f, 17.0767f, 2.0052f, 15.9059f)
                lineTo(2.0f, 15.7518f)
                verticalLineTo(5.2496f)
                curveTo(2.0f, 4.0587f, 2.9252f, 3.0839f, 4.096f, 3.0048f)
                lineTo(4.25f, 2.9996f)
                horizontalLineTo(12.0221f)
                curveTo(11.7255f, 3.4628f, 11.486f, 3.9661f, 11.3136f, 4.4996f)
                horizontalLineTo(4.25f)
                curveTo(3.8703f, 4.4996f, 3.5565f, 4.7817f, 3.5069f, 5.1478f)
                lineTo(3.5f, 5.2496f)
                verticalLineTo(15.7518f)
                curveTo(3.5f, 16.1315f, 3.7822f, 16.4453f, 4.1482f, 16.495f)
                lineTo(4.25f, 16.5018f)
                horizontalLineTo(19.7488f)
                curveTo(20.1285f, 16.5018f, 20.4423f, 16.2197f, 20.492f, 15.8536f)
                lineTo(20.4988f, 15.7518f)
                close()
                moveTo(13.998f, 18.0016f)
                horizontalLineTo(9.998f)
                lineTo(9.999f, 20.5f)
                horizontalLineTo(13.999f)
                lineTo(13.998f, 18.0016f)
                close()
            }
        }
        .build()
        return _desktopArrowRight!!
    }

private var _desktopArrowRight: ImageVector? = null
