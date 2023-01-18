package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) {
            return _genderTransgender!!
        }
        _genderTransgender = Builder(name = "GenderTransgender", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 34.0f)
                horizontalLineTo(168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(33.5f)
                lineTo(168.0f, 79.5f)
                lineTo(148.2f, 59.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, 8.4f)
                lineTo(159.5f, 88.0f)
                lineToRelative(-18.4f, 18.5f)
                arcToRelative(68.9f, 68.9f, 0.0f, true, false, 8.5f, 8.4f)
                lineTo(168.0f, 96.5f)
                lineToRelative(19.8f, 19.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, -8.4f)
                lineTo(176.5f, 88.0f)
                lineTo(210.0f, 54.5f)
                verticalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 34.0f)
                close()
                moveTo(137.0f, 201.0f)
                arcToRelative(58.1f, 58.1f, 0.0f, false, true, -82.0f, 0.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, true, true, 82.0f, -82.0f)
                arcToRelative(57.9f, 57.9f, 0.0f, false, true, 0.0f, 82.0f)
                close()
            }
        }
        .build()
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
