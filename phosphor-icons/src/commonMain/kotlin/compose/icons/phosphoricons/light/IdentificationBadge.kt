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

public val LightGroup.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) {
            return _identificationBadge!!
        }
        _identificationBadge = Builder(name = "IdentificationBadge", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(151.1f, 166.1f)
                arcTo(37.6f, 37.6f, 0.0f, false, false, 166.0f, 136.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -76.0f, 0.0f)
                arcToRelative(37.6f, 37.6f, 0.0f, false, false, 14.9f, 30.1f)
                arcToRelative(66.4f, 66.4f, 0.0f, false, false, -29.7f, 22.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, 7.2f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, true, 86.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.4f, 1.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.2f, -8.4f)
                arcTo(66.4f, 66.4f, 0.0f, false, false, 151.1f, 166.1f)
                close()
                moveTo(128.0f, 110.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, -26.0f, 26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 128.0f, 110.0f)
                close()
                moveTo(200.0f, 26.0f)
                lineTo(56.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f)
                lineTo(42.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 26.0f)
                close()
                moveTo(202.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(56.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(54.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(200.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(90.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(96.0f, 70.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 90.0f, 64.0f)
                close()
            }
        }
        .build()
        return _identificationBadge!!
    }

private var _identificationBadge: ImageVector? = null
