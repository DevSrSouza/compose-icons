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

public val FilledGroup.SportAmericanFootball: ImageVector
    get() {
        if (_sportAmericanFootball != null) {
            return _sportAmericanFootball!!
        }
        _sportAmericanFootball = Builder(name = "SportAmericanFootball", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.3786f, 11.4997f)
                curveTo(19.9489f, 16.2596f, 16.1795f, 20.0071f, 11.4064f, 21.4063f)
                lineTo(2.5937f, 12.5936f)
                curveTo(3.9929f, 7.8205f, 7.7404f, 4.0511f, 12.5003f, 2.6214f)
                lineTo(21.3786f, 11.4997f)
                close()
                moveTo(13.7197f, 9.2197f)
                lineTo(9.2197f, 13.7197f)
                curveTo(8.9268f, 14.0126f, 8.9268f, 14.4874f, 9.2197f, 14.7803f)
                curveTo(9.5126f, 15.0732f, 9.9874f, 15.0732f, 10.2803f, 14.7803f)
                lineTo(14.7803f, 10.2803f)
                curveTo(15.0732f, 9.9874f, 15.0732f, 9.5126f, 14.7803f, 9.2197f)
                curveTo(14.4874f, 8.9268f, 14.0126f, 8.9268f, 13.7197f, 9.2197f)
                close()
                moveTo(2.1992f, 14.3203f)
                lineTo(9.6797f, 21.8008f)
                curveTo(8.8892f, 21.9318f, 8.0776f, 22.0f, 7.25f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(3.9028f, 22.0f, 2.0f, 20.0972f, 2.0f, 17.75f)
                verticalLineTo(16.75f)
                curveTo(2.0f, 15.9224f, 2.0682f, 15.1107f, 2.1992f, 14.3203f)
                close()
                moveTo(14.2169f, 2.2167f)
                lineTo(21.7833f, 9.7831f)
                curveTo(21.9258f, 8.9601f, 22.0f, 8.1137f, 22.0f, 7.25f)
                verticalLineTo(6.25f)
                curveTo(22.0f, 3.9028f, 20.0972f, 2.0f, 17.75f, 2.0f)
                horizontalLineTo(16.75f)
                curveTo(15.8863f, 2.0f, 15.0399f, 2.0742f, 14.2169f, 2.2167f)
                close()
            }
        }
        .build()
        return _sportAmericanFootball!!
    }

private var _sportAmericanFootball: ImageVector? = null
