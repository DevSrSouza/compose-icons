package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.ArchiveFilled: ImageVector
    get() {
        if (_archiveFilled != null) {
            return _archiveFilled!!
        }
        _archiveFilled = Builder(name = "ArchiveFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                lineTo(20.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 5.0f)
                lineTo(22.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 7.0f)
                lineTo(4.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 5.0f)
                lineTo(2.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                curveToRelative(0.513f, 0.0f, 0.936f, 0.463f, 0.993f, 1.06f)
                lineToRelative(0.007f, 0.14f)
                verticalLineToRelative(7.2f)
                curveToRelative(0.0f, 1.917f, -1.249f, 3.484f, -2.824f, 3.594f)
                lineToRelative(-0.176f, 0.006f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-1.598f, 0.0f, -2.904f, -1.499f, -2.995f, -3.388f)
                lineToRelative(-0.005f, -0.212f)
                verticalLineToRelative(-7.2f)
                curveToRelative(0.0f, -0.663f, 0.448f, -1.2f, 1.0f, -1.2f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
            }
        }
        .build()
        return _archiveFilled!!
    }

private var _archiveFilled: ImageVector? = null
