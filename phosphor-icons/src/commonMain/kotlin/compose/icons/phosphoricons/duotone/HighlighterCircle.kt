package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) {
            return _highlighterCircle!!
        }
        _highlighterCircle = Builder(name = "HighlighterCircle", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(195.9f, 60.1f)
                arcTo(96.0f, 96.0f, 0.0f, true, false, 88.0f, 215.3f)
                verticalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(96.0f)
                lineToRelative(48.0f, -24.0f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(63.3f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 195.9f, 60.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.5f, 54.5f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, -147.0f, 0.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, 147.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 147.0f, 0.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, -147.0f)
                close()
                moveTo(96.0f, 210.0f)
                lineTo(96.0f, 152.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(58.0f)
                arcToRelative(88.3f, 88.3f, 0.0f, false, true, -64.0f, 0.0f)
                close()
                moveTo(144.0f, 136.0f)
                lineTo(112.0f, 136.0f)
                lineTo(112.0f, 100.9f)
                lineToRelative(32.0f, -16.0f)
                close()
                moveTo(190.2f, 190.2f)
                arcTo(86.8f, 86.8f, 0.0f, false, true, 176.0f, 201.8f)
                lineTo(176.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(160.0f, 72.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -3.8f, -6.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.8f, -0.4f)
                lineToRelative(-48.0f, 24.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 96.0f, 96.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(49.8f)
                arcTo(88.7f, 88.7f, 0.0f, false, true, 40.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 150.2f, 62.2f)
                close()
            }
        }
        .build()
        return _highlighterCircle!!
    }

private var _highlighterCircle: ImageVector? = null
