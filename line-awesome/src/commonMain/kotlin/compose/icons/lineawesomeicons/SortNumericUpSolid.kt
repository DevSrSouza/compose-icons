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
                moveTo(8.5898f, 5.0f)
                lineTo(8.4395f, 5.7793f)
                curveTo(8.4395f, 5.7793f, 8.2709f, 6.3595f, 7.8809f, 6.9395f)
                curveTo(7.4809f, 7.5195f, 6.98f, 8.0f, 6.0f, 8.0f)
                lineTo(6.0f, 10.0f)
                curveTo(7.38f, 10.0f, 8.32f, 9.3198f, 9.0f, 8.5898f)
                lineTo(9.0f, 15.0f)
                lineTo(11.0f, 15.0f)
                lineTo(11.0f, 5.0f)
                lineTo(8.5898f, 5.0f)
                close()
                moveTo(23.0f, 5.5f)
                lineTo(22.2793f, 6.1895f)
                lineTo(18.0f, 10.5f)
                lineTo(19.4102f, 11.9102f)
                lineTo(22.0f, 9.3105f)
                lineTo(22.0f, 28.0f)
                lineTo(24.0f, 28.0f)
                lineTo(24.0f, 9.3105f)
                lineTo(26.5898f, 11.9102f)
                lineTo(28.0f, 10.5f)
                lineTo(23.7207f, 6.1895f)
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
                curveTo(11.0f, 20.96f, 10.6505f, 21.4798f, 10.0605f, 21.8398f)
                curveTo(8.8305f, 22.5998f, 7.7498f, 23.0898f, 6.8398f, 23.5898f)
                curveTo(6.3898f, 23.8498f, 5.9791f, 24.0907f, 5.6191f, 24.4707f)
                curveTo(5.2691f, 24.8507f, 5.0f, 25.42f, 5.0f, 26.0f)
                lineTo(5.0f, 27.0f)
                lineTo(13.0f, 27.0f)
                lineTo(13.0f, 25.0f)
                lineTo(8.4395f, 25.0f)
                curveTo(9.1695f, 24.62f, 10.0191f, 24.2405f, 11.1191f, 23.5605f)
                curveTo(12.1391f, 22.9305f, 13.0f, 21.84f, 13.0f, 20.5f)
                curveTo(13.0f, 18.58f, 11.42f, 17.0f, 9.5f, 17.0f)
                lineTo(8.5f, 17.0f)
                close()
            }
        }
        .build()
        return _sortNumericUpSolid!!
    }

private var _sortNumericUpSolid: ImageVector? = null
