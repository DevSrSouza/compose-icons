package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Globe24: ImageVector
    get() {
        if (_globe24 != null) {
            return _globe24!!
        }
        _globe24 = Builder(name = "Globe24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.0f)
                curveTo(5.925f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f)
                reflectiveCurveToRelative(4.925f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.925f, 11.0f, -11.0f)
                reflectiveCurveTo(18.075f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(2.513f, 11.5f)
                horizontalLineToRelative(4.745f)
                curveToRelative(0.1f, -3.037f, 1.1f, -5.49f, 2.093f, -7.204f)
                curveToRelative(0.39f, -0.672f, 0.78f, -1.233f, 1.119f, -1.673f)
                curveTo(6.11f, 3.329f, 2.746f, 7.0f, 2.513f, 11.5f)
                close()
                moveTo(7.283f, 13.0f)
                lineTo(2.552f, 13.0f)
                arcToRelative(9.505f, 9.505f, 0.0f, false, false, 7.918f, 8.377f)
                arcToRelative(15.698f, 15.698f, 0.0f, false, true, -1.119f, -1.673f)
                curveTo(8.413f, 18.085f, 7.47f, 15.807f, 7.283f, 13.0f)
                close()
                moveTo(8.787f, 13.0f)
                horizontalLineToRelative(6.426f)
                curveToRelative(-0.183f, 2.48f, -1.02f, 4.5f, -1.862f, 5.951f)
                curveToRelative(-0.476f, 0.82f, -0.95f, 1.455f, -1.304f, 1.88f)
                lineTo(12.0f, 20.89f)
                lineToRelative(-0.047f, -0.057f)
                arcToRelative(13.888f, 13.888f, 0.0f, false, true, -1.304f, -1.88f)
                curveTo(9.807f, 17.5f, 8.969f, 15.478f, 8.787f, 13.0f)
                close()
                moveTo(15.241f, 11.5f)
                lineTo(8.759f, 11.5f)
                curveToRelative(0.1f, -2.708f, 0.992f, -4.904f, 1.89f, -6.451f)
                curveToRelative(0.476f, -0.82f, 0.95f, -1.455f, 1.304f, -1.88f)
                lineTo(12.0f, 3.11f)
                lineToRelative(0.047f, 0.057f)
                curveToRelative(0.353f, 0.426f, 0.828f, 1.06f, 1.304f, 1.88f)
                curveToRelative(0.898f, 1.548f, 1.79f, 3.744f, 1.89f, 6.452f)
                close()
                moveTo(16.717f, 13.0f)
                curveToRelative(-0.186f, 2.807f, -1.13f, 5.085f, -2.068f, 6.704f)
                curveToRelative(-0.39f, 0.672f, -0.78f, 1.233f, -1.118f, 1.673f)
                arcTo(9.505f, 9.505f, 0.0f, false, false, 21.447f, 13.0f)
                horizontalLineToRelative(-4.731f)
                close()
                moveTo(21.487f, 11.5f)
                horizontalLineToRelative(-4.745f)
                curveToRelative(-0.1f, -3.037f, -1.1f, -5.49f, -2.093f, -7.204f)
                curveToRelative(-0.39f, -0.672f, -0.78f, -1.233f, -1.119f, -1.673f)
                curveToRelative(4.36f, 0.706f, 7.724f, 4.377f, 7.957f, 8.877f)
                close()
            }
        }
        .build()
        return _globe24!!
    }

private var _globe24: ImageVector? = null
