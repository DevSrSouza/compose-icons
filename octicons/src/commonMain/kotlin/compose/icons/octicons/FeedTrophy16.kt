package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.FeedTrophy16: ImageVector
    get() {
        if (_feedTrophy16 != null) {
            return _feedTrophy16!!
        }
        _feedTrophy16 = Builder(name = "FeedTrophy16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.146f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.629f, 0.928f)
                lineTo(11.0f, 7.223f)
                verticalLineTo(5.0f)
                close()
                moveTo(5.0f, 7.223f)
                lineToRelative(-0.371f, -0.149f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 6.146f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.223f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(3.0f, 5.0f)
                verticalLineToRelative(1.146f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.257f, 1.858f)
                lineToRelative(0.865f, 0.346f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, false, 2.294f, 2.093f)
                curveTo(7.22f, 11.404f, 6.658f, 12.0f, 5.502f, 12.0f)
                horizontalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                curveToRelative(-1.158f, 0.0f, -1.72f, -0.595f, -1.916f, -1.557f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, false, 2.294f, -2.094f)
                lineToRelative(0.865f, -0.346f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 6.146f)
                verticalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _feedTrophy16!!
    }

private var _feedTrophy16: ImageVector? = null
