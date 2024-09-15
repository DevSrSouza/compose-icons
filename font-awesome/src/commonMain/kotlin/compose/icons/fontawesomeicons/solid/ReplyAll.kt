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

public val SolidGroup.ReplyAll: ImageVector
    get() {
        if (_replyAll != null) {
            return _replyAll!!
        }
        _replyAll = Builder(name = "ReplyAll", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.31f, 189.84f)
                lineTo(312.31f, 37.85f)
                curveTo(327.72f, 24.55f, 352.0f, 35.35f, 352.0f, 56.01f)
                verticalLineToRelative(82.76f)
                curveToRelative(129.18f, 10.23f, 224.0f, 52.21f, 224.0f, 183.55f)
                curveToRelative(0.0f, 61.44f, -39.58f, 122.31f, -83.33f, 154.13f)
                curveToRelative(-13.65f, 9.93f, -33.11f, -2.53f, -28.08f, -18.63f)
                curveToRelative(38.51f, -123.16f, -3.92f, -169.48f, -112.59f, -182.01f)
                verticalLineToRelative(84.18f)
                curveToRelative(0.0f, 20.7f, -24.3f, 31.45f, -39.69f, 18.16f)
                lineTo(136.31f, 226.16f)
                curveToRelative(-11.07f, -9.56f, -11.09f, -26.75f, 0.0f, -36.33f)
                close()
                moveTo(8.31f, 226.16f)
                lineTo(184.31f, 378.15f)
                curveTo(199.7f, 391.44f, 224.0f, 380.69f, 224.0f, 359.99f)
                verticalLineToRelative(-15.82f)
                lineToRelative(-108.61f, -93.79f)
                arcTo(55.96f, 55.96f, 0.0f, false, true, 96.0f, 208.0f)
                arcToRelative(55.95f, 55.95f, 0.0f, false, true, 19.39f, -42.38f)
                lineTo(224.0f, 71.83f)
                lineTo(224.0f, 56.01f)
                curveToRelative(0.0f, -20.67f, -24.28f, -31.47f, -39.69f, -18.16f)
                lineTo(8.31f, 189.84f)
                curveToRelative(-11.09f, 9.57f, -11.07f, 26.77f, 0.0f, 36.33f)
                close()
            }
        }
        .build()
        return _replyAll!!
    }

private var _replyAll: ImageVector? = null
