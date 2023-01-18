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

public val LightGroup.IdentificationCard: ImageVector
    get() {
        if (_identificationCard != null) {
            return _identificationCard!!
        }
        _identificationCard = Builder(name = "IdentificationCard", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(152.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 198.0f, 112.0f)
                close()
                moveTo(192.0f, 138.0f)
                lineTo(152.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(128.9f, 166.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.6f, 3.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -50.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.8f, 4.5f)
                lineToRelative(-1.5f, -0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.3f, -7.3f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 73.0f, 143.1f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, 38.2f, 0.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 128.9f, 166.5f)
                close()
                moveTo(92.1f, 138.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, false, -18.0f, -18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, false, 92.1f, 138.0f)
                close()
                moveTo(230.0f, 56.0f)
                lineTo(230.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(40.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(26.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 42.0f)
                lineTo(216.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 56.0f)
                close()
                moveTo(218.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(40.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(38.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(216.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _identificationCard!!
    }

private var _identificationCard: ImageVector? = null
