package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.SortNumericUpSolid: ImageVector
    get() {
        if (_sortNumericUpSolid != null) {
            return _sortNumericUpSolid!!
        }
        _sortNumericUpSolid = Builder(name = "SortNumericUpSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.59f, 5.0f)
                lineTo(8.439f, 5.779f)
                curveTo(8.439f, 5.779f, 8.271f, 6.359f, 7.881f, 6.939f)
                curveTo(7.481f, 7.519f, 6.98f, 8.0f, 6.0f, 8.0f)
                lineTo(6.0f, 10.0f)
                curveTo(7.38f, 10.0f, 8.32f, 9.32f, 9.0f, 8.59f)
                lineTo(9.0f, 15.0f)
                lineTo(11.0f, 15.0f)
                lineTo(11.0f, 5.0f)
                lineTo(8.59f, 5.0f)
                close()
                moveTo(23.0f, 5.5f)
                lineTo(22.279f, 6.189f)
                lineTo(18.0f, 10.5f)
                lineTo(19.41f, 11.91f)
                lineTo(22.0f, 9.311f)
                lineTo(22.0f, 28.0f)
                lineTo(24.0f, 28.0f)
                lineTo(24.0f, 9.311f)
                lineTo(26.59f, 11.91f)
                lineTo(28.0f, 10.5f)
                lineTo(23.721f, 6.189f)
                lineTo(23.0f, 5.5f)
                close()
                moveTo(8.5f, 17.0f)
                curveTo(6.58f, 17.0f, 5.0f, 18.58f, 5.0f, 20.5f)
                lineTo(5.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                lineTo(7.0f, 20.5f)
                curveTo(7.0f, 19.62f, 7.62f, 19.0f, 8.5f, 19.0f)
                lineTo(9.5f, 19.0f)
                curveTo(10.38f, 19.0f, 11.0f, 19.62f, 11.0f, 20.5f)
                curveTo(11.0f, 20.96f, 10.651f, 21.48f, 10.061f, 21.84f)
                curveTo(8.831f, 22.6f, 7.75f, 23.09f, 6.84f, 23.59f)
                curveTo(6.39f, 23.85f, 5.979f, 24.091f, 5.619f, 24.471f)
                curveTo(5.269f, 24.851f, 5.0f, 25.42f, 5.0f, 26.0f)
                lineTo(5.0f, 27.0f)
                lineTo(13.0f, 27.0f)
                lineTo(13.0f, 25.0f)
                lineTo(8.439f, 25.0f)
                curveTo(9.169f, 24.62f, 10.019f, 24.241f, 11.119f, 23.561f)
                curveTo(12.139f, 22.931f, 13.0f, 21.84f, 13.0f, 20.5f)
                curveTo(13.0f, 18.58f, 11.42f, 17.0f, 9.5f, 17.0f)
                lineTo(8.5f, 17.0f)
                close()
            }
        }
        .build()
        return _sortNumericUpSolid!!
    }

private var _sortNumericUpSolid: ImageVector? = null
