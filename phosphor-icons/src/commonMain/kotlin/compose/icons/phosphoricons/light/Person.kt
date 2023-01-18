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

public val LightGroup.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 78.0f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 94.0f, 44.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, false, 128.0f, 78.0f)
                close()
                moveTo(128.0f, 22.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, -22.0f, 22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 128.0f, 22.0f)
                close()
                moveTo(210.3f, 140.8f)
                lineTo(170.9f, 90.2f)
                lineToRelative(-0.5f, -0.6f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 152.0f, 82.0f)
                lineTo(104.0f, 82.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -18.4f, 7.6f)
                lineToRelative(-0.5f, 0.6f)
                lineTo(45.7f, 140.8f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 25.5f, 25.5f)
                lineToRelative(19.2f, -15.0f)
                lineTo(68.6f, 220.2f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -0.4f, 13.3f)
                arcToRelative(17.7f, 17.7f, 0.0f, false, false, 9.3f, 10.2f)
                arcToRelative(18.3f, 18.3f, 0.0f, false, false, 13.8f, 0.6f)
                arcToRelative(17.7f, 17.7f, 0.0f, false, false, 9.9f, -8.9f)
                lineTo(128.0f, 193.3f)
                lineToRelative(26.8f, 42.1f)
                arcToRelative(17.7f, 17.7f, 0.0f, false, false, 9.9f, 8.9f)
                arcToRelative(18.8f, 18.8f, 0.0f, false, false, 6.2f, 1.1f)
                arcToRelative(18.3f, 18.3f, 0.0f, false, false, 7.6f, -1.7f)
                arcToRelative(17.7f, 17.7f, 0.0f, false, false, 9.3f, -10.2f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -0.4f, -13.3f)
                lineToRelative(-21.8f, -68.9f)
                lineToRelative(19.2f, 15.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 25.5f, -25.5f)
                close()
                moveTo(201.5f, 157.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -8.5f, 0.0f)
                lineToRelative(-0.5f, -0.5f)
                lineToRelative(-34.8f, -27.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.1f, -0.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -2.3f, 6.7f)
                lineTo(176.0f, 224.1f)
                lineToRelative(0.3f, 0.7f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, 0.2f, 4.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -3.1f, 3.4f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -4.6f, 0.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -3.4f, -3.1f)
                lineToRelative(-0.3f, -0.7f)
                lineToRelative(-32.0f, -50.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.2f, 0.0f)
                lineToRelative(-32.0f, 50.3f)
                lineToRelative(-0.3f, 0.7f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -3.4f, 3.1f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -4.6f, -0.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -3.1f, -3.4f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, 0.2f, -4.6f)
                lineToRelative(0.3f, -0.7f)
                lineToRelative(27.7f, -87.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -2.3f, -6.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.1f, 0.2f)
                lineTo(63.5f, 157.0f)
                lineToRelative(-0.5f, 0.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -8.5f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.8f, -4.2f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 1.8f, -4.3f)
                lineToRelative(0.5f, -0.5f)
                lineTo(94.3f, 97.9f)
                arcTo(14.2f, 14.2f, 0.0f, false, true, 104.0f, 94.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, true, 9.7f, 3.9f)
                lineTo(201.0f, 148.5f)
                lineToRelative(0.5f, 0.5f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 1.8f, 4.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 201.5f, 157.5f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
