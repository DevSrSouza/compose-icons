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

public val LightGroup.ProjectorScreenChart: ImageVector
    get() {
        if (_projectorScreenChart != null) {
            return _projectorScreenChart!!
        }
        _projectorScreenChart = Builder(name = "ProjectorScreenChart", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.0f, 144.0f)
                lineTo(90.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(128.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(134.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 150.0f)
                close()
                moveTo(160.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(166.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 150.0f)
                close()
                moveTo(214.0f, 78.0f)
                lineTo(214.0f, 178.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(134.0f, 190.0f)
                verticalLineToRelative(20.8f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, -12.0f, 0.0f)
                lineTo(122.0f, 190.0f)
                lineTo(32.0f, 190.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(42.0f, 178.0f)
                lineTo(42.0f, 78.0f)
                lineTo(40.0f, 78.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 26.0f, 64.0f)
                lineTo(26.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 34.0f)
                lineTo(216.0f, 34.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                lineTo(230.0f, 64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                close()
                moveTo(128.0f, 222.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 128.0f, 222.0f)
                close()
                moveTo(40.0f, 66.0f)
                lineTo(216.0f, 66.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(218.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(40.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(38.0f, 64.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 40.0f, 66.0f)
                close()
                moveTo(202.0f, 78.0f)
                lineTo(54.0f, 78.0f)
                lineTo(54.0f, 178.0f)
                lineTo(202.0f, 178.0f)
                close()
            }
        }
        .build()
        return _projectorScreenChart!!
    }

private var _projectorScreenChart: ImageVector? = null
