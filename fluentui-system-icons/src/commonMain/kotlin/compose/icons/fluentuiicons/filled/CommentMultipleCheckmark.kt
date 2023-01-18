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

public val FilledGroup.CommentMultipleCheckmark: ImageVector
    get() {
        if (_commentMultipleCheckmark != null) {
            return _commentMultipleCheckmark!!
        }
        _commentMultipleCheckmark = Builder(name = "CommentMultipleCheckmark", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 2.0f)
                curveTo(6.5369f, 2.0f, 5.1334f, 3.3254f, 5.009f, 5.0067f)
                curveTo(5.0887f, 5.0023f, 5.1691f, 5.0f, 5.25f, 5.0f)
                horizontalLineTo(14.75f)
                curveTo(17.0972f, 5.0f, 19.0f, 6.9028f, 19.0f, 9.25f)
                verticalLineTo(11.1739f)
                curveTo(20.1472f, 11.4449f, 21.1769f, 12.0199f, 21.9995f, 12.8091f)
                curveTo(21.9998f, 12.7894f, 22.0f, 12.7697f, 22.0f, 12.75f)
                verticalLineTo(6.75f)
                curveTo(22.0f, 4.1266f, 19.8734f, 2.0f, 17.25f, 2.0f)
                horizontalLineTo(8.25f)
                close()
                moveTo(18.0f, 9.25f)
                verticalLineTo(11.0189f)
                curveTo(17.835f, 11.0064f, 17.6682f, 11.0f, 17.5f, 11.0f)
                curveTo(13.9101f, 11.0f, 11.0f, 13.9101f, 11.0f, 17.5f)
                curveTo(11.0f, 18.0163f, 11.0602f, 18.5185f, 11.1739f, 19.0f)
                horizontalLineTo(10.6667f)
                lineTo(7.0f, 21.75f)
                curveTo(6.176f, 22.368f, 5.0f, 21.7801f, 5.0f, 20.75f)
                verticalLineTo(18.9905f)
                curveTo(3.3219f, 18.8629f, 2.0f, 17.4608f, 2.0f, 15.75f)
                verticalLineTo(9.25f)
                curveTo(2.0f, 7.5392f, 3.3219f, 6.1371f, 5.0f, 6.0095f)
                curveTo(5.0825f, 6.0032f, 5.1659f, 6.0f, 5.25f, 6.0f)
                horizontalLineTo(14.75f)
                curveTo(16.5449f, 6.0f, 18.0f, 7.4551f, 18.0f, 9.25f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.4624f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 14.4624f, 23.0f, 17.5f, 23.0f)
                curveTo(20.5376f, 23.0f, 23.0f, 20.5376f, 23.0f, 17.5f)
                close()
                moveTo(20.8536f, 15.1464f)
                curveTo(21.0488f, 15.3417f, 21.0488f, 15.6583f, 20.8536f, 15.8536f)
                lineTo(16.8536f, 19.8536f)
                curveTo(16.6583f, 20.0488f, 16.3417f, 20.0488f, 16.1464f, 19.8536f)
                lineTo(14.1464f, 17.8536f)
                curveTo(13.9512f, 17.6583f, 13.9512f, 17.3417f, 14.1464f, 17.1464f)
                curveTo(14.3417f, 16.9512f, 14.6583f, 16.9512f, 14.8536f, 17.1464f)
                lineTo(16.5f, 18.7929f)
                lineTo(20.1464f, 15.1464f)
                curveTo(20.3417f, 14.9512f, 20.6583f, 14.9512f, 20.8536f, 15.1464f)
                close()
            }
        }
        .build()
        return _commentMultipleCheckmark!!
    }

private var _commentMultipleCheckmark: ImageVector? = null
