package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.SkipBack: ImageVector
    get() {
        if (_skipBack != null) {
            return _skipBack!!
        }
        _skipBack = Builder(name = "SkipBack", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(67.2f, 121.2f)
                lineTo(187.8f, 47.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 54.3f)
                verticalLineTo(201.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.2f, 6.9f)
                lineTo(67.2f, 134.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 67.2f, 121.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.8f, 40.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.1f, 0.3f)
                lineTo(64.0f, 113.7f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(142.3f)
                lineToRelative(119.7f, 73.1f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 8.3f, 2.3f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, 7.8f, -2.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 8.2f, -14.0f)
                verticalLineTo(54.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 199.8f, 40.3f)
                close()
                moveTo(192.0f, 201.7f)
                lineTo(71.3f, 128.0f)
                horizontalLineToRelative(0.0f)
                lineTo(192.0f, 54.3f)
                close()
            }
        }
        .build()
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
