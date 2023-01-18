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

public val FilledGroup.TextDirectionVertical: ImageVector
    get() {
        if (_textDirectionVertical != null) {
            return _textDirectionVertical!!
        }
        _textDirectionVertical = Builder(name = "TextDirectionVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                curveTo(8.0f, 3.4477f, 7.5523f, 3.0f, 7.0f, 3.0f)
                curveTo(6.4477f, 3.0f, 6.0f, 3.4477f, 6.0f, 4.0f)
                verticalLineTo(17.5858f)
                lineTo(5.7071f, 17.2929f)
                curveTo(5.3166f, 16.9024f, 4.6834f, 16.9024f, 4.2929f, 17.2929f)
                curveTo(3.9024f, 17.6834f, 3.9024f, 18.3166f, 4.2929f, 18.7071f)
                lineTo(6.2929f, 20.7071f)
                curveTo(6.6834f, 21.0976f, 7.3166f, 21.0976f, 7.7071f, 20.7071f)
                lineTo(9.7071f, 18.7071f)
                curveTo(10.0976f, 18.3166f, 10.0976f, 17.6834f, 9.7071f, 17.2929f)
                curveTo(9.3166f, 16.9024f, 8.6834f, 16.9024f, 8.2929f, 17.2929f)
                lineTo(8.0f, 17.5858f)
                verticalLineTo(4.0f)
                close()
                moveTo(17.1733f, 3.6154f)
                curveTo(17.0181f, 3.2427f, 16.654f, 3.0f, 16.2503f, 3.0f)
                curveTo(15.8466f, 3.0f, 15.4825f, 3.2427f, 15.3272f, 3.6154f)
                lineTo(11.5772f, 12.6154f)
                curveTo(11.3648f, 13.1252f, 11.6058f, 13.7107f, 12.1156f, 13.9231f)
                curveTo(12.6254f, 14.1355f, 13.2109f, 13.8944f, 13.4233f, 13.3846f)
                lineTo(14.4169f, 11.0f)
                horizontalLineTo(18.0836f)
                lineTo(19.0772f, 13.3846f)
                curveTo(19.2896f, 13.8944f, 19.8751f, 14.1355f, 20.3849f, 13.9231f)
                curveTo(20.8947f, 13.7107f, 21.1358f, 13.1252f, 20.9233f, 12.6154f)
                lineTo(17.1733f, 3.6154f)
                close()
                moveTo(17.2503f, 9.0f)
                horizontalLineTo(15.2503f)
                lineTo(16.2503f, 6.6f)
                lineTo(17.2503f, 9.0f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(15.4477f, 14.0f, 15.0f, 14.4477f, 15.0f, 15.0f)
                verticalLineTo(17.5858f)
                lineTo(14.7071f, 17.2929f)
                curveTo(14.3166f, 16.9024f, 13.6834f, 16.9024f, 13.2929f, 17.2929f)
                curveTo(12.9024f, 17.6834f, 12.9024f, 18.3166f, 13.2929f, 18.7071f)
                lineTo(15.2929f, 20.7071f)
                curveTo(15.6834f, 21.0976f, 16.3166f, 21.0976f, 16.7071f, 20.7071f)
                lineTo(18.7071f, 18.7071f)
                curveTo(19.0976f, 18.3166f, 19.0976f, 17.6834f, 18.7071f, 17.2929f)
                curveTo(18.3166f, 16.9024f, 17.6834f, 16.9024f, 17.2929f, 17.2929f)
                lineTo(17.0f, 17.5858f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 14.4477f, 16.5523f, 14.0f, 16.0f, 14.0f)
                close()
            }
        }
        .build()
        return _textDirectionVertical!!
    }

private var _textDirectionVertical: ImageVector? = null
