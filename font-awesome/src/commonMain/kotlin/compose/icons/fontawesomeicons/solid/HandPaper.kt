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

public val SolidGroup.HandPaper: ImageVector
    get() {
        if (_handPaper != null) {
            return _handPaper!!
        }
        _handPaper = Builder(name = "HandPaper", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.781f, 128.007f)
                curveTo(386.356f, 127.578f, 368.0f, 146.36f, 368.0f, 168.79f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(79.79f)
                curveToRelative(0.0f, -22.43f, -18.356f, -41.212f, -40.781f, -40.783f)
                curveTo(297.488f, 39.423f, 280.0f, 57.169f, 280.0f, 79.0f)
                verticalLineToRelative(177.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(40.79f)
                curveTo(272.0f, 18.36f, 253.644f, -0.422f, 231.219f, 0.007f)
                curveTo(209.488f, 0.423f, 192.0f, 18.169f, 192.0f, 40.0f)
                verticalLineToRelative(216.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(80.79f)
                curveToRelative(0.0f, -22.43f, -18.356f, -41.212f, -40.781f, -40.783f)
                curveTo(121.488f, 40.423f, 104.0f, 58.169f, 104.0f, 80.0f)
                verticalLineToRelative(235.992f)
                lineToRelative(-31.648f, -43.519f)
                curveToRelative(-12.993f, -17.866f, -38.009f, -21.817f, -55.877f, -8.823f)
                curveToRelative(-17.865f, 12.994f, -21.815f, 38.01f, -8.822f, 55.877f)
                lineToRelative(125.601f, 172.705f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 172.073f, 512.0f)
                horizontalLineToRelative(197.59f)
                curveToRelative(22.274f, 0.0f, 41.622f, -15.324f, 46.724f, -37.006f)
                lineToRelative(26.508f, -112.66f)
                arcToRelative(192.011f, 192.011f, 0.0f, false, false, 5.104f, -43.975f)
                verticalLineTo(168.0f)
                curveToRelative(0.001f, -21.831f, -17.487f, -39.577f, -39.218f, -39.993f)
                close()
            }
        }
        .build()
        return _handPaper!!
    }

private var _handPaper: ImageVector? = null
