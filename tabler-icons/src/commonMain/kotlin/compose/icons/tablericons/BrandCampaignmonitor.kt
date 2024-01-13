package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandCampaignmonitor: ImageVector
    get() {
        if (_brandCampaignmonitor != null) {
            return _brandCampaignmonitor!!
        }
        _brandCampaignmonitor = Builder(name = "BrandCampaignmonitor", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                lineToRelative(9.0f, -6.462f)
                lineToRelative(-9.0f, -5.538f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-12.0f)
                lineToRelative(-9.0f, 5.538f)
            }
        }
        .build()
        return _brandCampaignmonitor!!
    }

private var _brandCampaignmonitor: ImageVector? = null
