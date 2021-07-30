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

public val LineAwesomeIcons.SortNumericDownSolid: ImageVector
    get() {
        if (_sortNumericDownSolid != null) {
            return _sortNumericDownSolid!!
        }
        _sortNumericDownSolid = Builder(name = "SortNumericDownSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5938f, 5.0f)
                lineTo(8.4375f, 5.7813f)
                curveTo(8.4375f, 5.7813f, 8.2734f, 6.3555f, 7.875f, 6.9375f)
                curveTo(7.4766f, 7.5195f, 6.9805f, 8.0f, 6.0f, 8.0f)
                lineTo(6.0f, 10.0f)
                curveTo(7.375f, 10.0f, 8.3203f, 9.3242f, 9.0f, 8.5938f)
                lineTo(9.0f, 15.0f)
                lineTo(11.0f, 15.0f)
                lineTo(11.0f, 5.0f)
                close()
                moveTo(22.0f, 5.0f)
                lineTo(22.0f, 23.6875f)
                lineTo(19.4063f, 21.0938f)
                lineTo(18.0f, 22.5f)
                lineTo(22.2813f, 26.8125f)
                lineTo(23.0f, 27.5f)
                lineTo(23.7188f, 26.8125f)
                lineTo(28.0f, 22.5f)
                lineTo(26.5938f, 21.0938f)
                lineTo(24.0f, 23.6875f)
                lineTo(24.0f, 5.0f)
                close()
                moveTo(8.5f, 17.0f)
                curveTo(6.5781f, 17.0f, 5.0f, 18.5781f, 5.0f, 20.5f)
                lineTo(5.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                lineTo(7.0f, 20.5f)
                curveTo(7.0f, 19.625f, 7.625f, 19.0f, 8.5f, 19.0f)
                lineTo(9.5f, 19.0f)
                curveTo(10.375f, 19.0f, 11.0f, 19.625f, 11.0f, 20.5f)
                curveTo(11.0f, 20.957f, 10.6484f, 21.4805f, 10.0625f, 21.8438f)
                curveTo(8.8281f, 22.6016f, 7.7461f, 23.0859f, 6.8438f, 23.5938f)
                curveTo(6.3906f, 23.8477f, 5.9766f, 24.0898f, 5.625f, 24.4688f)
                curveTo(5.2734f, 24.8477f, 5.0f, 25.418f, 5.0f, 26.0f)
                lineTo(5.0f, 27.0f)
                lineTo(13.0f, 27.0f)
                lineTo(13.0f, 25.0f)
                lineTo(8.4375f, 25.0f)
                curveTo(9.1719f, 24.6211f, 10.0195f, 24.2422f, 11.125f, 23.5625f)
                curveTo(12.1406f, 22.9258f, 13.0f, 21.8438f, 13.0f, 20.5f)
                curveTo(13.0f, 18.5781f, 11.4219f, 17.0f, 9.5f, 17.0f)
                close()
            }
        }
        .build()
        return _sortNumericDownSolid!!
    }

private var _sortNumericDownSolid: ImageVector? = null
