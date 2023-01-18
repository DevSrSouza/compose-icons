package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) {
            return _genderTransgender!!
        }
        _genderTransgender = Builder(name = "GenderTransgender", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 28.0f)
                horizontalLineTo(172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(15.0f)
                lineTo(168.0f, 71.0f)
                lineTo(152.5f, 55.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(151.0f, 88.0f)
                lineTo(140.6f, 98.5f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, false, -98.3f, 7.8f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 96.0f, 236.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, false, 76.0f, -76.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, false, -14.4f, -44.6f)
                lineTo(168.0f, 105.0f)
                lineToRelative(15.5f, 15.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(185.0f, 88.0f)
                lineToRelative(19.0f, -19.0f)
                verticalLineTo(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 28.0f)
                close()
                moveTo(132.8f, 196.8f)
                arcTo(52.1f, 52.1f, 0.0f, true, true, 148.0f, 160.0f)
                arcTo(52.3f, 52.3f, 0.0f, false, true, 132.8f, 196.8f)
                close()
            }
        }
        .build()
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
