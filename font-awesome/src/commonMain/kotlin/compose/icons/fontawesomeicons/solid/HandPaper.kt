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
                moveTo(408.78f, 128.01f)
                curveTo(386.36f, 127.58f, 368.0f, 146.36f, 368.0f, 168.79f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(79.79f)
                curveToRelative(0.0f, -22.43f, -18.36f, -41.21f, -40.78f, -40.78f)
                curveTo(297.49f, 39.42f, 280.0f, 57.17f, 280.0f, 79.0f)
                verticalLineToRelative(177.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(40.79f)
                curveTo(272.0f, 18.36f, 253.64f, -0.42f, 231.22f, 0.01f)
                curveTo(209.49f, 0.42f, 192.0f, 18.17f, 192.0f, 40.0f)
                verticalLineToRelative(216.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(80.79f)
                curveToRelative(0.0f, -22.43f, -18.36f, -41.21f, -40.78f, -40.78f)
                curveTo(121.49f, 40.42f, 104.0f, 58.17f, 104.0f, 80.0f)
                verticalLineToRelative(235.99f)
                lineToRelative(-31.65f, -43.52f)
                curveToRelative(-12.99f, -17.87f, -38.01f, -21.82f, -55.88f, -8.82f)
                curveToRelative(-17.86f, 12.99f, -21.82f, 38.01f, -8.82f, 55.88f)
                lineToRelative(125.6f, 172.71f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 172.07f, 512.0f)
                horizontalLineToRelative(197.59f)
                curveToRelative(22.27f, 0.0f, 41.62f, -15.32f, 46.72f, -37.01f)
                lineToRelative(26.51f, -112.66f)
                arcToRelative(192.01f, 192.01f, 0.0f, false, false, 5.1f, -43.97f)
                verticalLineTo(168.0f)
                curveToRelative(0.0f, -21.83f, -17.49f, -39.58f, -39.22f, -39.99f)
                close()
            }
        }
        .build()
        return _handPaper!!
    }

private var _handPaper: ImageVector? = null
