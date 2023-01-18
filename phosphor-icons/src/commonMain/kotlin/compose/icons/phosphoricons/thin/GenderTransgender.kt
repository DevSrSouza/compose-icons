package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) {
            return _genderTransgender!!
        }
        _genderTransgender = Builder(name = "GenderTransgender", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                horizontalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(38.3f)
                lineTo(168.0f, 82.3f)
                lineTo(146.8f, 61.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.6f)
                lineTo(162.3f, 88.0f)
                lineToRelative(-21.1f, 21.2f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, 5.6f, 5.6f)
                lineTo(168.0f, 93.7f)
                lineToRelative(21.2f, 21.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineTo(173.7f, 88.0f)
                lineTo(212.0f, 49.7f)
                verticalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(138.4f, 202.4f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -84.8f, 0.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 84.8f, -84.8f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, true, 0.0f, 84.8f)
                close()
            }
        }
        .build()
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
