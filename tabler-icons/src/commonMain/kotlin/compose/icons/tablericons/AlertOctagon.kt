package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.AlertOctagon: VectorAsset
    get() {
        if (_alertOctagon != null) {
            return _alertOctagon!!
        }
        _alertOctagon = VectorAssetBuilder(name = "AlertOctagon", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.7f, 3.0f)
                horizontalLineToRelative(6.6f)
                curveToRelative(0.3f, 0.0f, 0.5f, 0.1f, 0.7f, 0.3f)
                lineToRelative(4.7f, 4.7f)
                curveToRelative(0.2f, 0.2f, 0.3f, 0.4f, 0.3f, 0.7f)
                verticalLineToRelative(6.6f)
                curveToRelative(0.0f, 0.3f, -0.1f, 0.5f, -0.3f, 0.7f)
                lineToRelative(-4.7f, 4.7f)
                curveToRelative(-0.2f, 0.2f, -0.4f, 0.3f, -0.7f, 0.3f)
                horizontalLineToRelative(-6.6f)
                curveToRelative(-0.3f, 0.0f, -0.5f, -0.1f, -0.7f, -0.3f)
                lineToRelative(-4.7f, -4.7f)
                curveToRelative(-0.2f, -0.2f, -0.3f, -0.4f, -0.3f, -0.7f)
                verticalLineToRelative(-6.6f)
                curveToRelative(0.0f, -0.3f, 0.1f, -0.5f, 0.3f, -0.7f)
                lineToRelative(4.7f, -4.7f)
                curveToRelative(0.2f, -0.2f, 0.4f, -0.3f, 0.7f, -0.3f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                lineTo(12.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                lineTo(12.01f, 16.0f)
            }
        }
        .build()
        return _alertOctagon!!
    }

private var _alertOctagon: VectorAsset? = null
