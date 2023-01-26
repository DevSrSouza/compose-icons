package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.ClosedCaptionDisabled: ImageVector
    get() {
        if (_closedCaptionDisabled != null) {
            return _closedCaptionDisabled!!
        }
        _closedCaptionDisabled = Builder(name = "ClosedCaptionDisabled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 10.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                lineTo(13.0f, 10.0f)
                close()
                moveTo(16.5f, 13.5f)
                lineToRelative(1.21f, 1.21f)
                curveTo(17.89f, 14.52f, 18.0f, 14.27f, 18.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(13.5f)
                close()
                moveTo(8.83f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(10.17f)
                lineToRelative(1.98f, 1.98f)
                curveToRelative(0.0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.16f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(6.83f)
                lineTo(8.83f, 6.0f)
                close()
                moveTo(19.78f, 22.61f)
                lineTo(17.17f, 20.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.15f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(7.5f, 13.5f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(0.67f)
                lineToRelative(-2.5f, -2.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(13.5f)
                close()
                moveTo(15.17f, 18.0f)
                lineTo(11.0f, 13.83f)
                verticalLineTo(14.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.32f, 0.16f, -0.59f, 0.4f, -0.78f)
                lineTo(5.0f, 7.83f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.17f)
                close()
            }
        }
        .build()
        return _closedCaptionDisabled!!
    }

private var _closedCaptionDisabled: ImageVector? = null
