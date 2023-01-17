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

public val Octicons.DesktopDownload16: ImageVector
    get() {
        if (_desktopDownload16 != null) {
            return _desktopDownload16!!
        }
        _desktopDownload16 = Builder(name = "DesktopDownload16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.927f, 5.427f)
                lineToRelative(2.896f, 2.896f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.354f, 0.0f)
                lineToRelative(2.896f, -2.896f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 10.896f, 5.0f)
                horizontalLineTo(8.75f)
                verticalLineTo(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.5f, 0.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.104f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.177f, 0.427f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.573f, 2.573f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.073f, 0.177f)
                verticalLineToRelative(7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, 0.25f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 16.0f, 2.75f)
                verticalLineToRelative(7.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 12.0f)
                horizontalLineToRelative(-3.727f)
                curveToRelative(0.099f, 1.041f, 0.52f, 1.872f, 1.292f, 2.757f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 11.25f, 16.0f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.565f, -1.243f)
                curveToRelative(0.772f, -0.885f, 1.192f, -1.716f, 1.292f, -2.757f)
                horizontalLineTo(1.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 10.25f)
                verticalLineToRelative(-7.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.75f, 1.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.177f, 0.073f)
                close()
                moveTo(6.982f, 12.0f)
                arcToRelative(5.72f, 5.72f, 0.0f, false, true, -0.765f, 2.5f)
                horizontalLineToRelative(3.566f)
                arcToRelative(5.72f, 5.72f, 0.0f, false, true, -0.765f, -2.5f)
                horizontalLineTo(6.982f)
                close()
            }
        }
        .build()
        return _desktopDownload16!!
    }

private var _desktopDownload16: ImageVector? = null
