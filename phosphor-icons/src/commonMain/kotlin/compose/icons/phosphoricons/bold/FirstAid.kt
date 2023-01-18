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

public val BoldGroup.FirstAid: ImageVector
    get() {
        if (_firstAid != null) {
            return _firstAid!!
        }
        _firstAid = Builder(name = "FirstAid", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 84.0f)
                lineTo(172.0f, 84.0f)
                lineTo(172.0f, 40.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(104.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 84.0f, 40.0f)
                lineTo(84.0f, 84.0f)
                lineTo(40.0f, 84.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(84.0f, 172.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(172.0f, 172.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 104.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 84.0f)
                close()
                moveTo(212.0f, 148.0f)
                lineTo(160.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(52.0f)
                lineTo(108.0f, 212.0f)
                lineTo(108.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(44.0f, 148.0f)
                lineTo(44.0f, 108.0f)
                lineTo(96.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(108.0f, 44.0f)
                horizontalLineToRelative(40.0f)
                lineTo(148.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(52.0f)
                close()
            }
        }
        .build()
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
