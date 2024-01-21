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

public val SolidGroup.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) {
            return _bookBookmark!!
        }
        _bookBookmark = Builder(name = "BookBookmark", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 96.0f)
                curveTo(0.0f, 43.0f, 43.0f, 0.0f, 96.0f, 0.0f)
                horizontalLineToRelative(96.0f)
                verticalLineTo(190.7f)
                curveToRelative(0.0f, 13.4f, 15.5f, 20.9f, 26.0f, 12.5f)
                lineTo(272.0f, 160.0f)
                lineToRelative(54.0f, 43.2f)
                curveToRelative(10.5f, 8.4f, 26.0f, 0.9f, 26.0f, -12.5f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(352.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(384.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                verticalLineTo(96.0f)
                close()
                moveTo(64.0f, 416.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(352.0f)
                verticalLineTo(384.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
