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

public val FilledGroup.TextCaseUppercase: ImageVector
    get() {
        if (_textCaseUppercase != null) {
            return _textCaseUppercase!!
        }
        _textCaseUppercase = Builder(name = "TextCaseUppercase", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0003f, 3.0f)
                horizontalLineTo(15.0003f)
                curveTo(14.448f, 3.0f, 14.0003f, 3.4477f, 14.0003f, 4.0f)
                verticalLineTo(19.25f)
                curveTo(14.0003f, 19.8023f, 14.448f, 20.25f, 15.0003f, 20.25f)
                horizontalLineTo(18.8753f)
                curveTo(21.5677f, 20.25f, 23.7503f, 18.0674f, 23.7503f, 15.375f)
                curveTo(23.7503f, 13.5711f, 22.7705f, 11.9961f, 21.3142f, 11.153f)
                curveTo(22.2001f, 10.2902f, 22.7503f, 9.0843f, 22.7503f, 7.75f)
                curveTo(22.7503f, 5.1266f, 20.6236f, 3.0f, 18.0003f, 3.0f)
                close()
                moveTo(18.0003f, 10.5f)
                horizontalLineTo(16.0003f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0003f)
                curveTo(19.5191f, 5.0f, 20.7503f, 6.2312f, 20.7503f, 7.75f)
                curveTo(20.7503f, 9.2688f, 19.5191f, 10.5f, 18.0003f, 10.5f)
                close()
                moveTo(16.0003f, 18.25f)
                verticalLineTo(12.5f)
                horizontalLineTo(18.8753f)
                curveTo(20.4631f, 12.5f, 21.7503f, 13.7872f, 21.7503f, 15.375f)
                curveTo(21.7503f, 16.9628f, 20.4631f, 18.25f, 18.8753f, 18.25f)
                horizontalLineTo(16.0003f)
                close()
                moveTo(7.2575f, 3.0f)
                curveTo(7.6763f, 3.0031f, 8.0489f, 3.2668f, 8.191f, 3.6607f)
                lineTo(13.691f, 18.9107f)
                curveTo(13.8783f, 19.4303f, 13.6091f, 20.0033f, 13.0895f, 20.1907f)
                curveTo(12.57f, 20.3781f, 11.997f, 20.1088f, 11.8096f, 19.5893f)
                lineTo(10.5151f, 16.0f)
                horizontalLineTo(3.7944f)
                lineTo(2.436f, 19.6028f)
                curveTo(2.2411f, 20.1196f, 1.6642f, 20.3805f, 1.1475f, 20.1857f)
                curveTo(0.6307f, 19.9909f, 0.3697f, 19.414f, 0.5646f, 18.8972f)
                lineTo(6.3146f, 3.6472f)
                curveTo(6.4623f, 3.2553f, 6.8387f, 2.997f, 7.2575f, 3.0f)
                close()
                moveTo(4.5485f, 14.0f)
                horizontalLineTo(9.7938f)
                lineTo(7.2294f, 6.8897f)
                lineTo(4.5485f, 14.0f)
                close()
            }
        }
        .build()
        return _textCaseUppercase!!
    }

private var _textCaseUppercase: ImageVector? = null
