package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 0.0f)
                curveTo(43.0f, 0.0f, 0.0f, 43.0f, 0.0f, 96.0f)
                verticalLineTo(352.0f)
                curveToRelative(0.0f, 48.0f, 35.2f, 87.7f, 81.1f, 94.9f)
                lineToRelative(-46.0f, 46.0f)
                curveTo(28.1f, 499.9f, 33.1f, 512.0f, 43.0f, 512.0f)
                horizontalLineTo(82.7f)
                curveToRelative(8.5f, 0.0f, 16.6f, -3.4f, 22.6f, -9.4f)
                lineTo(160.0f, 448.0f)
                horizontalLineTo(288.0f)
                lineToRelative(54.6f, 54.6f)
                curveToRelative(6.0f, 6.0f, 14.1f, 9.4f, 22.6f, 9.4f)
                horizontalLineTo(405.0f)
                curveToRelative(10.0f, 0.0f, 15.0f, -12.1f, 7.9f, -19.1f)
                lineToRelative(-46.0f, -46.0f)
                curveToRelative(46.0f, -7.1f, 81.1f, -46.9f, 81.1f, -94.9f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                horizontalLineTo(96.0f)
                close()
                moveTo(64.0f, 96.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(224.0f, 288.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -96.0f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
