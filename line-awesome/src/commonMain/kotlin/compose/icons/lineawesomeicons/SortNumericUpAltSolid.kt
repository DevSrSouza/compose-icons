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

public val LineAwesomeIcons.SortNumericUpAltSolid: ImageVector
    get() {
        if (_sortNumericUpAltSolid != null) {
            return _sortNumericUpAltSolid!!
        }
        _sortNumericUpAltSolid = Builder(name = "SortNumericUpAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.0f)
                curveTo(6.58f, 5.0f, 5.0f, 6.58f, 5.0f, 8.5f)
                lineTo(5.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                lineTo(7.0f, 8.5f)
                curveTo(7.0f, 7.62f, 7.62f, 7.0f, 8.5f, 7.0f)
                lineTo(9.5f, 7.0f)
                curveTo(10.38f, 7.0f, 11.0f, 7.62f, 11.0f, 8.5f)
                curveTo(11.0f, 8.96f, 10.651f, 9.48f, 10.061f, 9.84f)
                curveTo(8.831f, 10.6f, 7.75f, 11.09f, 6.84f, 11.59f)
                curveTo(6.39f, 11.85f, 5.979f, 12.091f, 5.619f, 12.471f)
                curveTo(5.269f, 12.851f, 5.0f, 13.42f, 5.0f, 14.0f)
                lineTo(5.0f, 15.0f)
                lineTo(13.0f, 15.0f)
                lineTo(13.0f, 13.0f)
                lineTo(8.439f, 13.0f)
                curveTo(9.169f, 12.62f, 10.019f, 12.241f, 11.119f, 11.561f)
                curveTo(12.139f, 10.931f, 13.0f, 9.84f, 13.0f, 8.5f)
                curveTo(13.0f, 6.58f, 11.42f, 5.0f, 9.5f, 5.0f)
                lineTo(8.5f, 5.0f)
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
                moveTo(8.59f, 17.0f)
                lineTo(8.439f, 17.779f)
                curveTo(8.439f, 17.779f, 8.271f, 18.359f, 7.881f, 18.939f)
                curveTo(7.481f, 19.519f, 6.98f, 20.0f, 6.0f, 20.0f)
                lineTo(6.0f, 22.0f)
                curveTo(7.38f, 22.0f, 8.32f, 21.32f, 9.0f, 20.59f)
                lineTo(9.0f, 27.0f)
                lineTo(11.0f, 27.0f)
                lineTo(11.0f, 17.0f)
                lineTo(8.59f, 17.0f)
                close()
            }
        }
        .build()
        return _sortNumericUpAltSolid!!
    }

private var _sortNumericUpAltSolid: ImageVector? = null
