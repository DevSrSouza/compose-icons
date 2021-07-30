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

public val SolidGroup.TextHeight: ImageVector
    get() {
        if (_textHeight != null) {
            return _textHeight!!
        }
        _textHeight = Builder(name = "TextHeight", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.0f, 32.0f)
                lineTo(16.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 48.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(304.0f)
                lineTo(80.0f, 416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-40.0f)
                lineTo(200.0f, 112.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(320.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(560.0f, 368.0f)
                horizontalLineToRelative(-48.0f)
                lineTo(512.0f, 144.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(14.31f, 0.0f, 21.33f, -17.31f, 11.31f, -27.31f)
                lineToRelative(-80.0f, -80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f)
                lineToRelative(-80.0f, 80.0f)
                curveTo(379.36f, 126.0f, 384.36f, 144.0f, 400.0f, 144.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(224.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-14.31f, 0.0f, -21.32f, 17.31f, -11.31f, 27.31f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 0.0f)
                lineToRelative(80.0f, -80.0f)
                curveTo(580.64f, 386.0f, 575.64f, 368.0f, 560.0f, 368.0f)
                close()
            }
        }
        .build()
        return _textHeight!!
    }

private var _textHeight: ImageVector? = null
