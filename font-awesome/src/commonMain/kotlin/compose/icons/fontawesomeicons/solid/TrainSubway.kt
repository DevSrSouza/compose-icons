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

public val SolidGroup.TrainSubway: ImageVector
    get() {
        if (_trainSubway != null) {
            return _trainSubway!!
        }
        _trainSubway = Builder(name = "TrainSubway", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 0.0f)
                curveTo(43.0f, 0.0f, 0.0f, 43.0f, 0.0f, 96.0f)
                lineTo(0.0f, 352.0f)
                curveToRelative(0.0f, 48.0f, 35.2f, 87.7f, 81.1f, 94.9f)
                lineToRelative(-46.0f, 46.0f)
                curveTo(28.1f, 499.9f, 33.1f, 512.0f, 43.0f, 512.0f)
                lineTo(82.7f, 512.0f)
                curveToRelative(8.5f, 0.0f, 16.6f, -3.4f, 22.6f, -9.4f)
                lineTo(160.0f, 448.0f)
                lineTo(288.0f, 448.0f)
                lineToRelative(54.6f, 54.6f)
                curveToRelative(6.0f, 6.0f, 14.1f, 9.4f, 22.6f, 9.4f)
                lineTo(405.0f, 512.0f)
                curveToRelative(10.0f, 0.0f, 15.0f, -12.1f, 7.9f, -19.1f)
                lineToRelative(-46.0f, -46.0f)
                curveToRelative(46.0f, -7.1f, 81.1f, -46.9f, 81.1f, -94.9f)
                lineTo(448.0f, 96.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                lineTo(96.0f, 0.0f)
                close()
                moveTo(64.0f, 128.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(96.0f, 256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(64.0f, 128.0f)
                close()
                moveTo(272.0f, 96.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(272.0f, 256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(240.0f, 128.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(64.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(352.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _trainSubway!!
    }

private var _trainSubway: ImageVector? = null
