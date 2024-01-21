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

public val SolidGroup.BridgeLock: ImageVector
    get() {
        if (_bridgeLock != null) {
            return _bridgeLock!!
        }
        _bridgeLock = Builder(name = "BridgeLock", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(576.0f, 32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(536.0f, 96.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-61.9f, 0.0f, -112.0f, 50.1f, -112.0f, 112.0f)
                verticalLineToRelative(24.6f)
                curveToRelative(-9.9f, 5.8f, -18.2f, 14.1f, -23.8f, 24.1f)
                curveToRelative(-17.6f, -20.0f, -43.4f, -32.7f, -72.2f, -32.7f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(160.0f, 480.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(128.0f, 384.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                lineTo(32.0f, 160.0f)
                horizontalLineToRelative(72.0f)
                lineTo(104.0f, 96.0f)
                lineTo(64.0f, 96.0f)
                curveTo(46.3f, 96.0f, 32.0f, 81.7f, 32.0f, 64.0f)
                close()
                moveTo(408.0f, 96.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(80.0f)
                lineTo(488.0f, 96.0f)
                lineTo(408.0f, 96.0f)
                close()
                moveTo(360.0f, 160.0f)
                lineTo(360.0f, 96.0f)
                lineTo(280.0f, 96.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(80.0f)
                close()
                moveTo(152.0f, 96.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(80.0f)
                lineTo(232.0f, 96.0f)
                lineTo(152.0f, 96.0f)
                close()
                moveTo(528.0f, 240.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(64.0f)
                lineTo(560.0f, 272.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(448.0f, 272.0f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(640.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(448.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(416.0f, 352.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(448.0f, 272.0f)
                close()
            }
        }
        .build()
        return _bridgeLock!!
    }

private var _bridgeLock: ImageVector? = null
