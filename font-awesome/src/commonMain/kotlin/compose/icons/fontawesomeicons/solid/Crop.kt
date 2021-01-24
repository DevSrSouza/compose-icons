package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = Builder(name = "Crop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(488.0f, 352.0f)
                horizontalLineToRelative(-40.0f)
                verticalLineTo(109.25f)
                lineToRelative(59.31f, -59.31f)
                curveToRelative(6.25f, -6.25f, 6.25f, -16.38f, 0.0f, -22.63f)
                lineTo(484.69f, 4.69f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0.0f)
                lineTo(402.75f, 64.0f)
                horizontalLineTo(192.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(114.75f)
                lineTo(160.0f, 306.75f)
                verticalLineTo(24.0f)
                curveToRelative(0.0f, -13.26f, -10.75f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(88.0f)
                curveTo(74.75f, 0.0f, 64.0f, 10.74f, 64.0f, 24.0f)
                verticalLineToRelative(40.0f)
                horizontalLineTo(24.0f)
                curveTo(10.75f, 64.0f, 0.0f, 74.74f, 0.0f, 88.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(264.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(232.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineTo(205.25f)
                lineTo(352.0f, 205.25f)
                verticalLineTo(488.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -13.26f, -10.75f, -24.0f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _crop!!
    }

private var _crop: ImageVector? = null
