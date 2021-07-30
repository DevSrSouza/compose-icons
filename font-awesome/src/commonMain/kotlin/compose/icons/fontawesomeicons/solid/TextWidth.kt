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

public val SolidGroup.TextWidth: ImageVector
    get() {
        if (_textWidth != null) {
            return _textWidth!!
        }
        _textWidth = Builder(name = "TextWidth", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 32.0f)
                lineTo(16.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 48.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                horizontalLineToRelative(120.0f)
                verticalLineToRelative(112.0f)
                horizontalLineToRelative(-24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-24.0f)
                lineTo(264.0f, 112.0f)
                horizontalLineToRelative(120.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(448.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(363.31f, 292.69f)
                curveTo(354.0f, 283.36f, 336.0f, 288.36f, 336.0f, 304.0f)
                verticalLineToRelative(48.0f)
                lineTo(112.0f, 352.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -14.31f, -17.31f, -21.32f, -27.31f, -11.31f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.62f)
                lineToRelative(80.0f, 80.0f)
                curveTo(94.0f, 484.64f, 112.0f, 479.64f, 112.0f, 464.0f)
                verticalLineToRelative(-48.0f)
                horizontalLineToRelative(224.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 14.31f, 17.31f, 21.33f, 27.31f, 11.31f)
                lineToRelative(80.0f, -80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.62f)
                close()
            }
        }
        .build()
        return _textWidth!!
    }

private var _textWidth: ImageVector? = null
